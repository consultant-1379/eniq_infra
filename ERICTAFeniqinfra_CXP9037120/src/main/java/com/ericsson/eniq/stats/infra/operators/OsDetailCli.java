package com.ericsson.eniq.stats.infra.operators;

import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.Operator;
import com.ericsson.cifwk.taf.data.DataHandler;
import com.ericsson.cifwk.taf.tools.cli.CLI;

@Operator(context = { Context.CLI })
public class OsDetailCli extends CliCommonUtils implements OsDetailOperator {

	@SuppressWarnings("finally")
	public boolean checkOSandVersion() {
		boolean status = false;

		try {
			String expectedOsAndVersiononENIQ = "Red Hat Enterprise Linux Server release 7.6";
			String filename = "/etc/redhat-release"; // contains OS and version
														// detail e.g. CentOS
														// release 6.6, Red Hat
														// Enterprise L
			String command = "cat " + filename;
			System.out.println("OsDetailCli:getOSandVersion()-> Checking OS Release and Version on ENIQ-S in file " + filename);
			String output = runCommand(command, 200L, new CLI(DataHandler.getHostByName("eniqs")));
			if(output.startsWith(expectedOsAndVersiononENIQ))
			{
				status = true;
				System.out.println("OsDetailCli:getOSandVersion()-> The OS Version on ENIQ-S matches " + expectedOsAndVersiononENIQ);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			return status;
		}

	}

}
