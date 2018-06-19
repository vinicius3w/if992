package br.ufpe.cin.if992.test.tdd.temperatura.conversor;


import org.junit.Test;

import br.ufpe.cin.if992.tdd.temperatura.conversor.FahrenheitParaCelsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;

import junit.framework.TestCase;

public class FahrenheitParaCelsiusTest extends TestCase {

	@Test
	public void testConversor() throws Exception {
		Celsius vCelsius = FahrenheitParaCelsius.Convert(Fahrenheit.SOLIDO);
		assertTrue(vCelsius.getValor() == Celsius.SOLIDO.getValor());
	}

}
