/*
 *  14.	Escreva no console as seguintes quest�o:
 * 
 * b.	Imprima no console o seguinte texto concatenando as vari�veis
	i.	Meu nome � <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos. 
	Se voc� quiser entrar em contato comigo, pode ligar para o telefone <telefone>. 
	H� esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>.

 */
package exercicios.numero14.itemb;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int anoNascimento;
		String telefone;
		String cidadeNascimento;
		int idade;
		
		System.out.println("Digite seu nome");
		nome = scanner.next();
		
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = scanner.nextInt();
		
		System.out.println("Digite seu Telefone");
		telefone = scanner.next();
		
		System.out.println("Digite a cidade de nascimento");
		cidadeNascimento = scanner.next();
		
		scanner.close();
		
		idade = 2017 - anoNascimento;
		
		System.out.println("Meu nome �: "+ nome + "nasci no ano: "+ anoNascimento + ", tenho "+ idade +" anos. Se voc� quiser entrar em contato comigo, pode ligar para o telefone "+ telefone +" H�, esqueci de te dizer aonde eu nasci, foi na cidade de: "+ cidadeNascimento);
		
	}
}
