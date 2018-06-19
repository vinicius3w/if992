package br.ufpe.cin.if992.tdd.temperatura.escalas;

public class Fahrenheit {
	
	public static final Fahrenheit SOLIDO = new Fahrenheit(32);

	public static final Fahrenheit FUSAO = new Fahrenheit(212);

	public static final Fahrenheit ZERO = new Fahrenheit(-459.4);

	private double mValor;

	public Fahrenheit (double pValor) {
		mValor = pValor;
	}

	public double getValor () {
		return mValor;
	}

	public void setValor (double pValor) {
		mValor = pValor;
	}

}
