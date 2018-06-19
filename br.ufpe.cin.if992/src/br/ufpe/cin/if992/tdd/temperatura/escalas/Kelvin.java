package br.ufpe.cin.if992.tdd.temperatura.escalas;

public class Kelvin {

	public static final Kelvin SOLIDO = new Kelvin(273.15);

	public static final Kelvin FUSAO = new Kelvin(373.15);

	public static final Kelvin ZERO = new Kelvin(0);

	private double mValor;

	public Kelvin (double pValor) {
		mValor = pValor;
	}

	public double getValor () {
		return mValor;
	}

	public void setValor (double pValor) {
		mValor = pValor;
	}

}
