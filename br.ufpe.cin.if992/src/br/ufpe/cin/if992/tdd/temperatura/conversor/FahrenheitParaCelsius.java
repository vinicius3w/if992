package br.ufpe.cin.if992.tdd.temperatura.conversor;

import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;

public class FahrenheitParaCelsius {
	
	private FahrenheitParaCelsius () {

	}

	public static Celsius Convert (Fahrenheit pFahrenheit) {
		// formula errada
		//double vValorCelsius = ((5 / 9) * pFahrenheit.getValor()) - 
		//		Fahrenheit.SOLIDO.getValor();
		// formula correta
		double vValorCelsius = (5 / 9) * (pFahrenheit.getValor() - 
				Fahrenheit.SOLIDO.getValor());
		Celsius vCelsius = new Celsius(vValorCelsius);
		return vCelsius;
	}

}
