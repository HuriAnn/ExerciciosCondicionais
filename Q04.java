package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar,
		 * e se � positivo ou negativo.
		 */
		
		int num;
		
		System.out.println("\n Entre com um n�mero inteiro:");
		num = leia.nextInt();
		
		if(num>0 && num%2==0) 
		{
			System.out.println("\n Este n�mero � par positivo");
		}
		else if(num<0 && num%2==0) 
		{
			System.out.println("\n Este n�mero � par e negativo");
		}
		else if(num>0 && num%2==1) 
		{
			System.out.println("\n Este n�mero � �mpar e positivo");
		}
		else if(num<0 && num%2==1)
		{
			System.out.println("\n Este n�mero � �mpar e negativo");
		}
		
	}
	
}
