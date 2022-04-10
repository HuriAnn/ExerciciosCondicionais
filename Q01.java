package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {


		/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
		 * e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		float Peso = 50;
		float P;
		
		System.out.println("\n Entre com o valor do peso:");
		P = leia.nextFloat();
		
		double E = P - Peso;
		double M = E * 4;
		
		if(P>50) 
		{
			System.out.println("\n O peso excedente é de: "+E+"Kg e o valor da multa é de: "+M);
		}
		else if (P>50 && P<50) 
		{
			E = 0;
			M = 0;
			System.out.println("\n Não há multa a ser paga");
			System.out.println("\n O peso excedente é de: "+E+"Kg e o valor da multa é de: "+M);
		}
		else 
		{
			System.out.println("\n Este valor está incorreto");
		}
		
	}

}
