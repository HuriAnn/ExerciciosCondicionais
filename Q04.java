package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
		 * e se é positivo ou negativo.
		 */
		
		int num;
		
		System.out.println("\n Entre com um número inteiro:");
		num = leia.nextInt();
		
		if(num>0 && num%2==0) 
		{
			System.out.println("\n Este número é par positivo");
		}
		else if(num<0 && num%2==0) 
		{
			System.out.println("\n Este número é par e negativo");
		}
		else if(num>0 && num%2==1) 
		{
			System.out.println("\n Este número é ímpar e positivo");
		}
		else if(num<0 && num%2==1)
		{
			System.out.println("\n Este número é ímpar e negativo");
		}
		
	}
	
}
