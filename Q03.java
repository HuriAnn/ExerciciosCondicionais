package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		/* Desenvolva um sistema em que: 
		 * Leia 4 (quatro) n�meros; 
		 * Calcule o quadrado de cada um; 
		 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		 * Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
		System.out.println("\n Digite o primeiro n�mero:");
		n1 = leia.nextDouble();
		
		System.out.println("\n Digite o segundo n�mero:");
		n2 = leia.nextDouble();
		
		System.out.println("\n Digite o terceiro n�mero:");
		n3 = leia.nextDouble();
		
		System.out.println("\n Digite o quarto n�mero:");
		n4 = leia.nextDouble();
		
		if(Math.pow(n3, 2)>=1000) 
		{
			System.out.println("\n O valor quadrado do terceiri valor �: "+Math.pow(n3, 2));
		}
		else 
		{
			System.out.println("O primeiro n�mero digitado foi:   "+n1+" e o valor quadrado dele �: "+Math.pow(n1, 2));
			System.out.println("O primeiro segundo digitado foi:  "+n2+" e o valor quadrado dele �: "+Math.pow(n2, 2));
			System.out.println("O primeiro terceiro digitado foi: "+n3+" e o valor quadrado dele �: "+Math.pow(n3, 2));
			System.out.println("O primeiro quarto digitado foi:   "+n4+" e o valor quadrado dele �: "+Math.pow(n4, 2));
		}
	}

}
