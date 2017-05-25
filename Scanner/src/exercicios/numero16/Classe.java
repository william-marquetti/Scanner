/*
 * 16.	Fale para o usuário digitar no console apenas números, quantos o mesmo achar necessário.
 *  Após o usuário digitar, o algoritmo deve substituir todas os números 
 *  pelas respectivas letras, conforme quadro abaixo. 
 *  Ou seja, se o usuário digitar o seguinte valor (1 4 2 3 5 3), 
 *  deve ser impresso no console (A D B C E C).
 *  
			a.	1 = A
			b.	2 = B
			c.	3 = C
			d.	4 = D
			e.	5 = E
			f.	6 = F
			g.	7 = G
			h.	8 = H
			i.	9 = I
			j.	10 = J
			k.	11 = L 
			l.	12 = M
			m.	13 = N
			n.	14 = O
			o.	15 = P 
			p.	16 = Q
			q.	17 = R
			r.	18 = S
			s.	19 = T
			t.	20 = U
			u.	21 = V
			v.	22 = X
			w.	23 = Z

 */
package exercicios.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String numeros;

		System.out.println("Digite os números desejados");
		numeros = scanner.nextLine();

		// adiciona cada item entre os espaços no array de String partes
		String[] partes = numeros.split("\\s");

		// adiciona cada letra da string para o array de char alfabeto
		char[] alfabeto = "abcdefghijlmnopqrstuvxz".toCharArray();

		// percorre o array de números digitados
		for (int numerosDigitados = 0; numerosDigitados < partes.length; numerosDigitados++) {
			
			// percorre o array de letras do alfabeto
			for (int aux = 0; aux <= alfabeto.length; aux++) {
				
				// compara se o valor armazenado no array de numeros digitados é igual a posição da letra do alfabeto
				if (Integer.parseInt(partes[numerosDigitados])-1 == aux ) {
					System.out.print(" " + alfabeto[aux]);
					
				}

			}

		}
		
		System.out.println();
		//System.out.println("Viu como funciona?");

		scanner.close();

	}

}
