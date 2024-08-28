package com.ericsson.eniq.stats.infra.operators;

import java.util.List;

import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.Operator;
import com.ericsson.cifwk.taf.data.Host;
import com.ericsson.cifwk.taf.handlers.RemoteFileHandler;
import com.ericsson.cifwk.taf.tools.cli.CLI;
import com.ericsson.cifwk.taf.tools.cli.CLITool;
import com.ericsson.cifwk.taf.tools.cli.Shell;
import com.ericsson.cifwk.taf.tools.cli.jsch.JSchCLIToolException;
import com.ericsson.cifwk.taf.utils.FileFinder;

@Operator(context = { Context.CLI })
public class CliCommonUtils {

	private static final String EXIT_CODE = "EXIT_CODE:";

	/**
	 * This method accepts a cli command and timeout value. It executes the command
	 * on the host cli, prints the output and returns the output of execution.
	 * 
	 * @param command
	 * @param timeOut
	 * @return
	 */
	@SuppressWarnings("finally")
	protected String runCommand(String command, Long timeOut, CLI cliShell) {
		System.out.println("CliCommonUtils::runCommand()-> Running " + command + " cmd ");
		Shell runShell = cliShell.executeCommand(command, "echo \"" + EXIT_CODE + "\"$?");
		String output = null;
		String exitCode = null;
		while (!runShell.isClosed() && timeOut > 0) {
			output = runShell.read();
			if (output.length() > 1) {
				System.out.println(output);
			}
			timeOut -= CLITool.DEFAULT_TIMEOUT_SEC;
		}
		String lastLine = runShell.read();
		System.out.println("CliCommonUtils::runCommand()-> lastline of output:" + lastLine.length());
		System.out.println("CliCommonUtils::runCommand()-> EXIT_CODE:" + EXIT_CODE.length());
		try {
			if (lastLine.length() < EXIT_CODE.length()) {
				lastLine = output;
			}
			System.out.println(lastLine.split(EXIT_CODE)[1].trim());
			exitCode = lastLine.split(EXIT_CODE)[1].trim();

		} catch (JSchCLIToolException | IndexOutOfBoundsException e) {
			System.err.println(e);
		} finally {
			runShell.disconnect();
			System.out.println("CliCommonUtils::runCommand()-> Result of command execution in CLI" + Short.valueOf(exitCode));
			System.out.println("CliCommonUtils::runCommand()-> Output of command :" + command + " is " + output);
			return output;

		}
	}

	/**
	 * This method copies the file on to the server given in the host.properties
	 * file in the specified path
	 * 
	 * @param fileName
	 * @param locationOnServer
	 * @return result
	 */
	protected boolean sendFileRemotely(String fileName, String locationOnServer, Host host) {

		boolean transfered = true;
		try {
			//Host host = DataHandler.getHostByType(HostType.GATEWAY);//Pass this from called method
			RemoteFileHandler remote = new RemoteFileHandler(host);
			List<String> fileLocation = FileFinder.findFile(fileName);
			String remoteFileLocation = locationOnServer;
			boolean status = remote.copyLocalFileToRemote(fileLocation.get(0), remoteFileLocation);
			System.out.println("CliCommonUtils::sendFileRemotely()-> "+status);
		} catch (Exception e) {
			System.out.println("CliCommonUtils::sendFileRemotely()-> "+ e.getMessage());
			transfered = false;
		}
		return transfered;
	}

}
