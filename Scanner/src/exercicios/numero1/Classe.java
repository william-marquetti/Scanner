/*
 * 1.	Escreva no console para digitar um número inteiro, 
 * leia o número inteiro digitado e imprima o número no console.
 */

package exercicios.numero1;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		// Inicialização do scanner 
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero");
		
		// receber um numero atravez do scanner
		numero = scanner.nextInt();
		
		System.out.println(numero);
		
		// fechar o scanner
		scanner.close();
	}
}
