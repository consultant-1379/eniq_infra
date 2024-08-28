package com.ericsson.eniq.stats.infra.tests;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.ericsson.cifwk.taf.TestCase;
import com.ericsson.cifwk.taf.TorTestCaseHelper;
import com.ericsson.cifwk.taf.annotations.Context;
import com.ericsson.cifwk.taf.guice.OperatorRegistry;

import com.ericsson.eniq.stats.infra.operators.nodehardening;

public class testprintstatement extends TorTestCaseHelper implements TestCase{

	@Inject
	OperatorRegistry<nodehardening> operatorRegistry;

	private nodehardening getOperator() {
		return operatorRegistry.provide(nodehardening.class);
	}
	/*
	@Test
	@Context(context = { Context.CLI })
	public void testingprint(){
		System.out.println("in test");
		assertEquals(getOperator().compliance(), "NON-COMPLIANT");
	}
	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("print.py"), "NON-COMPLIANT");
	}
	*/

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance01(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_SeLinux.py"), "COMPLIANT");
	}
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance02(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_Firewall.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance03(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance3.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance04(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance4.py"), "COMPLIANT");
	}

	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance05(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance5.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance06(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance6.py"), "COMPLIANT");
	}
/*
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance07(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance7.py"), "NON-COMPLIANT");
	}
*/
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance08(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance8.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance09(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance9.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance10(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance10.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance11(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance11.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance12(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance12.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance13(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance13.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance14(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance14.py"), "COMPLIANT");
	}

	/*
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance15(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance15.py"), "NON-COMPLIANT");
	}
	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance16(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance16.py"), "NON-COMPLIANT");
	}

	 */


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance17(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance17.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance18(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance18.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance19(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance19.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance20(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance20.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance21(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance21.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance22(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance22.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance23(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance23.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance24(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance24.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance25(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance25.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance26(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance26.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance27(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance27.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance28(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance28.py"), "COMPLIANT");
	}


	//From Here
	/*
	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance001(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_SeLinux.py"), "COMPLIANT");
	}
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance002(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_Firewall.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance003(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance3.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance004(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance4.py"), "COMPLIANT");
	}

	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance005(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance5.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance006(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance6.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance008(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance8.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance009(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance9.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance010(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance10.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance011(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance11.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance012(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance12.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance013(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance13.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance014(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance14.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance017(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance17.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance018(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance18.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance019(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance19.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance020(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance20.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance021(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance21.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance022(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance22.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance023(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance23.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance024(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance24.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance025(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance25.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance026(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance26.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance027(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance27.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance028(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance28.py"), "COMPLIANT");
	}

	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0001(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_SeLinux.py"), "COMPLIANT");
	}
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0002(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance_Firewall.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0003(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance3.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0004(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance4.py"), "COMPLIANT");
	}

	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0005(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance5.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0006(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance6.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0008(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance8.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0009(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance9.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0010(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance10.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0011(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance11.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0012(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance12.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0013(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance13.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0014(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance14.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0017(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance17.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0018(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance18.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0019(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance19.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0020(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance20.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0021(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance21.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0022(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance22.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0023(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance23.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0024(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance24.py"), "COMPLIANT");
	}

	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0025(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance25.py"), "COMPLIANT");
	}
*/
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0026(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance26.py"), "COMPLIANT");
	}


	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0027(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance27.py"), "COMPLIANT");
	}


	
	@Test
	@Context(context = { Context.CLI })
	public void testingprintcompliance0028(){
		System.out.println("in test");
		assertEquals(getOperator().complianceTest("NH_Compliance28.py"), "COMPLIANT");
	}
	
	//Till Here
	
}
