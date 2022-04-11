package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		   Infantil A = 5 a 7 anos
		   Infantil B = 8 a 11 anos
		   Juvenil A = 12 a 13 anos
		   Juvenil B = 14 a 17 anos
		   Adultos = Maiores de 18 anos
		*/
		
		int idade;
		
		System.out.println("\n Digite a idade");
		idade = leia.nextInt();
		
		if(idade>5 && idade<=7) 
		{
			System.out.println("\n Nadador classificado na categoria Infantil A");
		}
		else if(idade>7 && idade<=11) 
		{
			System.out.println("\n Nadador classificado na categoria Infantil B");
		}
		else if(idade>12 && idade<=14) 
		{
			System.out.println("\n Nadador classificado na categoria Juvenil B");
		}
		else if(idade>14 && idade<=18) 
		{
			System.out.println("\n Nadador classificado na categoria Juvenil B");
		}
		else if(idade>18) 
		{
			System.out.println("\n Nadador classificado na categoria Adulto");
		}
		else 
		{
			System.out.println("\n Não há classificação de categoria para a idade informada");
		}
		
		
	}

}
