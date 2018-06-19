package br.ufpe.cin.if992.test.tdd.temperatura.conversor;


import junit.framework.TestCase;

import org.junit.Test;

import br.ufpe.cin.if992.tdd.temperatura.conversor.KelvinParaFahrenheit;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Kelvin;

public class KelvinParaFahrenheitTest extends TestCase {

	@Test
	public void testConvert() throws Exception {
		Fahrenheit vFahrenheit = KelvinParaFahrenheit.Convert(Kelvin.SOLIDO);		
		assertTrue(vFahrenheit.getValor() == Fahrenheit.SOLIDO.getValor());
	}

}
