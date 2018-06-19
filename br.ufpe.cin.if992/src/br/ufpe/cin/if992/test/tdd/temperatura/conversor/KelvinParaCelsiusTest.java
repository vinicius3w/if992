package br.ufpe.cin.if992.test.tdd.temperatura.conversor;


import junit.framework.TestCase;

import org.junit.Test;

import br.ufpe.cin.if992.tdd.temperatura.conversor.KelvinParaCelsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Kelvin;

public class KelvinParaCelsiusTest extends TestCase {

	@Test
	public void testConvert() throws Exception {
		Celsius vCelsius = KelvinParaCelsius.Convert(Kelvin.SOLIDO);
		assertTrue(vCelsius.getValor() == Celsius.SOLIDO.getValor());
	}

}
