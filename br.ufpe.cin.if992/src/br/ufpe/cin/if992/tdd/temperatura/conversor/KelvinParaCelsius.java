package br.ufpe.cin.if992.tdd.temperatura.conversor;

import br.ufpe.cin.if992.tdd.temperatura.escalas.Celsius;
import br.ufpe.cin.if992.tdd.temperatura.escalas.Kelvin;

public class KelvinParaCelsius {
	
	public KelvinParaCelsius() {
		
	}
	
	public static Celsius Convert (Kelvin pKelvin) {
		double vValorCelsius =  pKelvin.getValor() - Kelvin.SOLIDO.getValor();
		Celsius vCelsius = new Celsius(vValorCelsius);
		return vCelsius;
	}

}
