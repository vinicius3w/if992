package br.ufpe.cin.if992.tdd.temperatura.conversor;

import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Fahrenheit;

public class CelsiusParaFahrenheit {
	
	private CelsiusParaFahrenheit () {

	}

	public static Fahrenheit Convert (Celsius pCelsius) {
		double vValorFahrenheit = (5 / 9) * pCelsius.getValor() + 
				Fahrenheit.SOLIDO.getValor();

		Fahrenheit vFahrenheit = new Fahrenheit(vValorFahrenheit);
		return vFahrenheit;
	}

}
