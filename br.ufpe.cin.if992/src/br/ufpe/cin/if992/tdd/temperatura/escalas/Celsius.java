package br.ufpe.cin.if992.tdd.temperatura.escalas;

public class Celsius {
	
	public static final Celsius SOLIDO = new Celsius(0);

	public static final Celsius FUSAO = new Celsius(100);

	public static final Celsius ZERO = new Celsius(-273);

	private double mValor;

	public Celsius (double pValor) {
		mValor = pValor;
	}

	public double getValor () {
		return mValor;
	}

	public void setValor (double pValor) {
		mValor = pValor;
	}

}
