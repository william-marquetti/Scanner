/*
 * 18.	Pe�a para o usu�rio digitar um n�mero. 
 * Guarde o n�mero que o usu�rio digitou. 
 * Subtraia o n�mero por 5 e imprima o resultado. 
 * Pegue novamente o n�mero que o usu�rio digitou e subtraia por 3 e imprima o resultado. 
 * Pegue o resultado da subtra��o por 5 e o resultado da subtra��o por 3 e 
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
		
		System.out.println("Digite um n�mero");
		numero1 = scanner.nextInt();
		
		scanner.close();
		
		subtracao = (numero1 - 5);
		System.out.println("Resultado: "+ subtracao);
		
		subtracao2 = (numero1 - 3);
		System.out.println("Resultado: "+ subtracao2);
		
		System.out.println("Resultado 1� subtracao: "+ subtracao + " Resultado da 2� subtracao: "+ subtracao2);
		
		

	}

}
