package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		/* Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
		  (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
		*/
		
		double base, altura;
		
		System.out.println("\n Digite o valor da base do tri�ngulo:");
		base = leia.nextDouble();
		
		System.out.println("\n Digite o valor da altura do tri�ngulo");
		altura = leia.nextDouble();
		
		if(base>0 && altura>0) 
		{
			System.out.println("\n O valor da �rea do tri�ngulo � igual a :"+base * altura);
		}
		else 
		{
			System.out.println("\n N�o � poss�vel calcular a �rea do tri�ngulo");
		}
		
		

	}

}
