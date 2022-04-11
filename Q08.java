package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
		 * caso contrário imprimi-la com o valor zero.
		 */
		
		double num;
		
		System.out.println("\n Entre com um valor");
		num = leia.nextDouble();
		
		if(num>100) 
		{
			System.out.println("\n Valor digitado: "+num);
		}
		else 
		{
			System.out.println(num=0);
		}

	}

}
