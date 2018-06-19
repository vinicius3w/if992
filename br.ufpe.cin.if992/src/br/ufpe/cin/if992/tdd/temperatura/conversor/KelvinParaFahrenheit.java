package br.ufpe.cin.if992.tdd.temperatura.conversor;

import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Kelvin;

public class KelvinParaFahrenheit {

	public KelvinParaFahrenheit() {
		
	}
	
	public static Fahrenheit Convert (Kelvin pKelvin) {
		Celsius vCelsius = KelvinParaCelsius.Convert(pKelvin);
		return CelsiusParaFahrenheit.Convert(vCelsius);
	}

}
