/*
 * 14.	Escreva no console as seguintes questão:
	a.	Pergunte para o usuário as seguintes questões, as responta e armazene em variáveis.
		i.	Digite seu nome:
		ii.	Digite seu ano de nascimento:
		iii.	Digite seu telefone:
		iv.	Digite a cidade de nascimento

 */

package exercicios.numero14.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int anoNascimento;
		String telefone;
		String cidadeNascimento;
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = scanner.nextInt();
		
		System.out.println("Digite seu Telefone");
		telefone = scanner.nextLine();
		
		System.out.println("Digite a cidade de nascimento");
		cidadeNascimento = scanner.nextLine();
		
		scanner.close();
		
		
	}
}
