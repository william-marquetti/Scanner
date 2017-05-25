/*
 * 20.	Peça para o usuário digitar um texto. 
 * Guarde o texto que o usuário digitou em uma variável. 
 * Crie outra variável de nome “outroTexto”, atribuindo o valor da variável que o usuário digitou. 
 * Altere o valor da variável que o usuário digitou para “Olá”. 
 * Imprima as duas variáveis, e observe o que foi impresso.
 */
package exercicios.numero20;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String textoUsuario = "";
		String outroTexto  = "";
		
		System.out.println("Digite um texto");
		textoUsuario = scanner.nextLine();
		scanner.close();
		
		outroTexto = textoUsuario;
		
		System.out.println(outroTexto);
		
		textoUsuario = "Olá";
		
		System.out.println("Texto textoUsuario: " + textoUsuario + " Texto outroTexto: " + outroTexto );
		

	}

}
