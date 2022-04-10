package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {


		/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
		 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
		 * deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) 
		 * e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
		 * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("\n O peso excedente � de: "+E+"Kg e o valor da multa � de: "+M);
		}
		else if (P>50 && P<50) 
		{
			E = 0;
			M = 0;
			System.out.println("\n N�o h� multa a ser paga");
			System.out.println("\n O peso excedente � de: "+E+"Kg e o valor da multa � de: "+M);
		}
		else 
		{
			System.out.println("\n Este valor est� incorreto");
		}
		
	}

}
