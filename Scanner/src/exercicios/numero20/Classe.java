/*
 * 20.	Pe�a para o usu�rio digitar um texto. 
 * Guarde o texto que o usu�rio digitou em uma vari�vel. 
 * Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel que o usu�rio digitou. 
 * Altere o valor da vari�vel que o usu�rio digitou para �Ol�. 
 * Imprima as duas vari�veis, e observe o que foi impresso.
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
		
		textoUsuario = "Ol�";
		
		System.out.println("Texto textoUsuario: " + textoUsuario + " Texto outroTexto: " + outroTexto );
		

	}

}
