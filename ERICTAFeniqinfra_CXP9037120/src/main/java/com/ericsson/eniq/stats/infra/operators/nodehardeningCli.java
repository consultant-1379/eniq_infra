package com.ericsson.eniq.stats.infra.operators;

import java.util.List;

import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.Operator;
import com.ericsson.cifwk.taf.data.DataHandler;
import com.ericsson.cifwk.taf.data.Host;
import com.ericsson.cifwk.taf.data.HostType;
import com.ericsson.cifwk.taf.handlers.RemoteFileHandler;
import com.ericsson.cifwk.taf.tools.cli.CLI;
import com.ericsson.cifwk.taf.tools.cli.CLITool;
import com.ericsson.cifwk.taf.tools.cli.Shell;
import com.ericsson.cifwk.taf.tools.cli.jsch.JSchCLIToolException;
import com.ericsson.cifwk.taf.utils.FileFinder;
@Operator(context = { Context.CLI })
public class nodehardeningCli implements nodehardening{

	private static final CLI cliShell = new CLI(DataHandler.getHostByName("gateway"));
	  
	private static final String EXIT_CODE = "EXIT_CODE:";
	  
	  
	@Override

	public String compliance() {
		// TODO Auto-generated method stub
		String fileName = "scripts/NH_Compliance.py";
    	String fileServerLocation = "/tmp";
    	sendFileRemotely(fileName, fileServerLocation);
		/*String out= runCommand("python /tmp/NH_Compliance.py", 320L);*/
		String command = "python /tmp/NH_Compliance.py";
		String out = runCommand(command, 200L, new CLI(DataHandler.getHostByName("eniqs")));
		
		System.out.println("cli class: "+out);
		return out;
	}
 
	@Override
	public String complianceTest(String fileName1) {
		// TODO Auto-generated method stub
		String fileName = "scripts/"+fileName1;
    	String fileServerLocation = "/tmp";
    	sendFileRemotely(fileName, fileServerLocation);
		String out= runCommand("python /tmp/"+fileName1, 320L);
		
		System.out.println("cli class: "+out);
		
		String tempOut = "COMPLIANT";
		if (out != null && out.contains("NON-COMPLIANT"))
		{
			tempOut = "NON-COMPLIANT";
		}

		return tempOut;
	}
	
	private String runCommand(String command, Long timeOut) {
	    System.out.println("Running "+ command +" cmd");
	    Shell runShell = cliShell.executeCommand(command, "echo \"" + EXIT_CODE + "\"$?");
	    String output = null;
	    while (!runShell.isClosed() && timeOut > 0) {
	      output = runShell.read();
	      System.out.println("Inside While");
	      if (output.length() > 1){
	        System.out.println(output);
	      }
	      timeOut -= CLITool.DEFAULT_TIMEOUT_SEC;
	    }
	    String lastLine = runShell.read();
	    short result = -1;
	    System.out.println("lastline:"+lastLine.length());
	    System.out.println("EXIT_CODE:"+EXIT_CODE.length());
	    System.out.println("output:"+output);
	    try {
	      if (lastLine.length() < EXIT_CODE.length()){
	        System.out.println("inside if");
	        lastLine = output;
	      }
	      System.out.println(lastLine.split(EXIT_CODE)[1].trim());
	      String exitCode = lastLine.split(EXIT_CODE)[1].trim();
	      System.out.println("result:"+Short.valueOf(exitCode));
	      result = Short.valueOf(exitCode);
	    } catch (JSchCLIToolException | IndexOutOfBoundsException e) {
	      System.err.println( e);
	    }
	    System.out.println("Shell exit code is " + result);
	    runShell.disconnect();
	    output = output.split(EXIT_CODE)[0].trim();
	    return output;
	  }
	
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
	private boolean sendFileRemotely(String fileName, String fileServerLocation) {

        boolean transfered = true;
        try {
        	/*String server = "gateway";
        	Object obj = server;*/
                Host host = DataHandler.getHostByType(HostType.GATEWAY);
                
            	/*Object objUser = user;
                User operUser = (User) objUser;*/
                //User operUser = new User(host.getUser(UserType.ADMIN),host.getPass(UserType.ADMIN),UserType.ADMIN);
                RemoteFileHandler remote = new RemoteFileHandler(host );
                List<String> fileLocation = FileFinder.findFile(fileName);                 
                String remoteFileLocation = fileServerLocation;            
                boolean status = remote.copyLocalFileToRemote(fileLocation.get(0) ,remoteFileLocation);
                System.out.println(status);
        }catch (Exception e) {
                System.out.println(e.getMessage());
                transfered = false;
        }
        return transfered;
}

}
