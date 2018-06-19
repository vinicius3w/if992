package br.ufpe.cin.if992.test.tdd.temperatura.conversor;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	
	public static Test suite ()
	{
		TestSuite vSuite = new TestSuite("Test for " +
				"br.ufpe.cin.if992.test.tdd.temperatura.conversor");
		//$JUnit-BEGIN$
		vSuite.addTestSuite(FahrenheitParaCelsiusTest.class);
		vSuite.addTestSuite(CelsiusParaFahrenheitTest.class);
		vSuite.addTestSuite(KelvinParaCelsiusTest.class);
		vSuite.addTestSuite(KelvinParaFahrenheitTest.class);
		//$JUnit-END$
		return vSuite;
	}

}
