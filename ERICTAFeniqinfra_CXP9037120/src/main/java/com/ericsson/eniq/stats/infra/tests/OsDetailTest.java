package com.ericsson.eniq.stats.infra.tests;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.ericsson.cifwk.taf.TestCase;
import com.ericsson.cifwk.taf.TorTestCaseHelper;
import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.annotations.TestId;
import com.ericsson.cifwk.taf.guice.OperatorRegistry;
import com.ericsson.eniq.stats.infra.operators.OsDetailOperator;

public class OsDetailTest extends TorTestCaseHelper implements TestCase {

	@Inject
	OperatorRegistry<OsDetailOperator> operatorRegistry;

	private OsDetailOperator getOperator() {
		return operatorRegistry.provide(OsDetailOperator.class);
	}

	@TestId(id = "XXX_Func_1")
	@Context(context = { Context.CLI })
	@Test(priority = 1)
	public void runTestCase() {
		System.out.println("OsDetailTest::runTestCase()-> checkOSandVersion()");
		assertTrue(getOperator().checkOSandVersion());
	
	}
}
