package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		/* Receber valores de base e altura de um triângulo e verificar se são valores válidos
		  (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		*/
		
		double base, altura;
		
		System.out.println("\n Digite o valor da base do triângulo:");
		base = leia.nextDouble();
		
		System.out.println("\n Digite o valor da altura do triângulo");
		altura = leia.nextDouble();
		
		if(base>0 && altura>0) 
		{
			System.out.println("\n O valor da área do triângulo é igual a :"+base * altura);
		}
		else 
		{
			System.out.println("\n Não é possível calcular a área do triângulo");
		}
		
		

	}

}
