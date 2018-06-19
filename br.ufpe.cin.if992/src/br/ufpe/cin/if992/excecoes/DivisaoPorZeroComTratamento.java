package br.ufpe.cin.if992.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tratando ArithmeticExceptions e InputMismatchExceptions
 * @author viniciusgarcia
 *
 */
public class DivisaoPorZeroComTratamento {
	// demonstra o lancamento de uma excecao quando ocorrer uma divisao por zero
	public static int quociente( int numerador, int denominador ) 
			throws ArithmeticException {
	   return numerador / denominador; // possivel divisao por zero
	}

	public static void main( String[] args ) {
		Scanner entrada = new Scanner( System.in ); // scanner para entrada
		boolean continueLoop = true; // determina se mais entradas sao necessarias

		do {
			try { // le dois numeros e calcula o quociente 
				System.out.println("Entre com um numero inteiro para numerador: ");
				int numerador = entrada.nextInt();
				System.out.println("Entre com um numero inteiro para denominador: ");
				int denominador = entrada.nextInt();

				int resultado = quociente( numerador, denominador );
				System.out.printf( "\nResultado: %d / %d = %d\n", numerador,
				   denominador, resultado );
				continueLoop = false; // entrada com sucesso; final do looping
			} // fim do try
			catch ( InputMismatchException inputMismatchException ) {
				System.err.printf( "\nExcecao: %s\n",
						inputMismatchException );
				entrada.nextLine(); // descarta a entrada e o usuario pode tentar de novo
				System.out.println(
						"Voce deve entrar com numeros inteiros. Por favor tente novamente.\n" );
			} // fim do catch
			catch ( ArithmeticException arithmeticException ) {
				System.err.printf( "\nExcecao: %s\n", arithmeticException );
				System.out.println(
						"Zero eh um denominador invalido. Por favor tente novamente.\n" );
			} // fim do catch
		} while ( continueLoop ); // fim do do...while
   } // fim do main
} // fim da classe DivisaoPorZeroComTratamento


