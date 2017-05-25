/*
 * 18.	Peça para o usuário digitar um número. 
 * Guarde o número que o usuário digitou. 
 * Subtraia o número por 5 e imprima o resultado. 
 * Pegue novamente o número que o usuário digitou e subtraia por 3 e imprima o resultado. 
 * Pegue o resultado da subtração por 5 e o resultado da subtração por 3 e 
 * imprima os dois resultado.
 */
package exercicios.numero18;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int subtracao;
		int subtracao2;
		
		System.out.println("Digite um número");
		numero1 = scanner.nextInt();
		
		scanner.close();
		
		subtracao = (numero1 - 5);
		System.out.println("Resultado: "+ subtracao);
		
		subtracao2 = (numero1 - 3);
		System.out.println("Resultado: "+ subtracao2);
		
		System.out.println("Resultado 1º subtracao: "+ subtracao + " Resultado da 2ª subtracao: "+ subtracao2);
		
		

	}

}
