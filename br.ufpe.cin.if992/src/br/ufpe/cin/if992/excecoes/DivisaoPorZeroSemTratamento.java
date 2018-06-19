package br.ufpe.cin.if992.excecoes;

import java.util.Scanner;

/**
 * Divisao de um inteiro sem tratamento de excecao
 * @author viniciusgarcia
 *
 */
public class DivisaoPorZeroSemTratamento {
	
	// demonstra o lancamento de uma excecao quando ocorrer uma divisao por zero
	public static int quociente( int numerador, int denominador ) {
	   return numerador / denominador; // possivel divisao por zero
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Entre com um numero inteiro para numerador: ");
		int numerador = entrada.nextInt();
		System.out.println("Entre com um numero inteiro para denominador: ");
		int denominador = entrada.nextInt();
		int resultado = quociente(numerador, denominador);
	    System.out.printf(
	    		"\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
	}

}
