package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
		 * E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento 
		 * armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
		 * imprimir o sal�rio total e o sal�rio excedente.
		 */
		
		Scanner leia = new Scanner (System.in);

		int C;
		System.out.println("\n Digite o c�digo do operador:");
		C = leia.nextInt();
		
		float N;
		System.out.println("\n Digite a quantidade de horas trabalhadas:");
		N = leia.nextFloat();
		
		
		double salario = N * 10;
		float valorExcedente = N * 50;
		float E = valorExcedente * 20;
		
		if(N>50)
		{
			System.out.println("\n Valor do sal�rio: \t\t: R$"+salario+
					"\n Valor de horas excedentes: "+E+
					"\n Valor total do sal�rio: R$"+(salario+E));
		}
		else if(N>0 && N<50) 
		{
			System.out.println("\n Valor do sal�rio: \t\t: R$"+salario+
					"\n Valor de horas excedentes: "+E+
					"\n Valor total do sal�rio: R$"+(salario+E));
		}
		else 
		{
			System.out.println("\n Valor inv�lido");
		}
	}

}
