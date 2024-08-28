package com.ericsson.eniq.stats.infra.operators;


import java.util.List;

import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.Operator;
import com.ericsson.cifwk.taf.data.DataHandler;
import com.ericsson.cifwk.taf.data.Host;
import com.ericsson.cifwk.taf.data.HostType;
import com.ericsson.cifwk.taf.data.User;
import com.ericsson.cifwk.taf.data.UserType;
import com.ericsson.cifwk.taf.handlers.RemoteFileHandler;
import com.ericsson.cifwk.taf.tools.cli.CLI;
import com.ericsson.cifwk.taf.tools.cli.CLITool;
import com.ericsson.cifwk.taf.tools.cli.Shell;
import com.ericsson.cifwk.taf.tools.cli.jsch.JSchCLIToolException;
import com.ericsson.cifwk.taf.utils.FileFinder;

@Operator(context = { Context.CLI })
public class SampleOperatorCli implements SampleOperator {

  private static final CLI cliShell = new CLI(DataHandler.getHostByName("gateway"));
  
  private static final String EXIT_CODE = "EXIT_CODE:";
  
  
  private boolean runCommand(String command, Long timeOut) {
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
    return result == 0;
  }

@Override
    public boolean sampleScript() {
    try{
    	String fileName = "scripts/hello.py";
    	String fileServerLocation = "/tmp";
    	sendFileRemotely(fileName, fileServerLocation);
    	System.out.println("In CLI implementation");
    	boolean status;
      status = runCommand("python /tmp/hello.py",200L);
      System.out.println(status);
      return status;
      
    }catch(Exception e){
      e.printStackTrace();
      return false;
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
