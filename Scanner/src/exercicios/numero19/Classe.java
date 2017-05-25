/*
 * 19.	Peça para o usuário digitar um número. 
 * Guarde o número que o usuário digitou na variável “primeiroNumero”. 
 * Crie outra variável de nome “segundoNumero”, atribuindo o valor da variável “primeiroNumero”. 
 * Altere o valor da variavel “primeiroNumero” para 10. 
 * Imprima a variável “primeiroNumero” e a variável “segundoNumero”. 
 * Verifique os valores das variáveis, como ficaram.
 */
package exercicios.numero19;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int primeiroNumero;
		int segundoNumero;
		
		System.out.println("Digite um número");
		primeiroNumero = scanner.nextInt();
		scanner.close();
		
		segundoNumero = primeiroNumero;
		
		primeiroNumero = 10;

		System.out.println("Resultado primeiroNumero: "+ primeiroNumero + " Resultado segundoNumero: "+ segundoNumero);
		
	}

}
