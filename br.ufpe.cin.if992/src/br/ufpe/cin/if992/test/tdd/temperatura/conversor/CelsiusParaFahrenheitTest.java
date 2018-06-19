package br.ufpe.cin.if992.test.tdd.temperatura.conversor;

import org.junit.Test;

import br.ufpe.cin.if992.tdd.temperatura.conversor.CelsiusParaFahrenheit;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;

import junit.framework.TestCase;

public class CelsiusParaFahrenheitTest extends TestCase {

	@Test
	public void testConversor() throws Exception {
		Fahrenheit vFahrenheit = CelsiusParaFahrenheit.Convert(Celsius.SOLIDO);
		assertTrue(vFahrenheit.getValor() == Fahrenheit.SOLIDO.getValor());
	}

}
