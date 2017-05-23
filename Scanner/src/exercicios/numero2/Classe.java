/*
 * 2.	Escreva no console para digitar um texto, 
 * leia o texto digitado e imprima o texto no console. 
 */

package exercicios.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		// Inicialização do scanner 
		Scanner scanner = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite um texto");
		
		// receber um numero atravez do scanner
		texto = scanner.nextLine();
		
		System.out.println(texto);
		
		// fechar o scanner
		scanner.close();
	}
}
