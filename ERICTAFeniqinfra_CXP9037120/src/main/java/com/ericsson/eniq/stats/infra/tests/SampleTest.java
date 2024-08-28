package com.ericsson.eniq.stats.infra.tests;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.ericsson.cifwk.taf.TestCase;
import com.ericsson.cifwk.taf.TorTestCaseHelper;
import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.TestId;
import com.ericsson.cifwk.taf.guice.OperatorRegistry;
import com.ericsson.eniq.stats.infra.operators.SampleOperator;

public class SampleTest extends TorTestCaseHelper implements TestCase {

	@Inject
	OperatorRegistry<SampleOperator> operatorRegistry;

	private SampleOperator getOperator() {
		return operatorRegistry.provide(SampleOperator.class);
	}

	@TestId(id = "CIP-8129_Func_1")
	@Context(context = { Context.CLI })
	@Test(priority = 1)
	public void verifySampleScript() {
		System.out.println("In Test Class");
		assertTrue(getOperator().sampleScript());
	
	}
}
