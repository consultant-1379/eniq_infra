package com.ericsson.eniq.stats.infra.tests;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.ericsson.cifwk.taf.TestCase;
import com.ericsson.cifwk.taf.TorTestCaseHelper;
import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.guice.OperatorRegistry;

import com.ericsson.eniq.stats.infra.operators.nodehardening;

public class NodeHardeningTest extends TorTestCaseHelper implements TestCase{

	@Inject
	OperatorRegistry<nodehardening> operatorRegistry;

	private nodehardening getOperator() {
		return operatorRegistry.provide(nodehardening.class);
	}

	//Sample test case

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance01(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_SeLinux.py"), "COMPLIANT");
	}

	
}
