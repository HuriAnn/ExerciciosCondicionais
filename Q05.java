package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são
		 * altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25.
		 * Se o índice sobe para 0,3 as indústrias do 1o grupo são intimadas a suspenderem suas atividades,
		 * se o índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a suspenderem suas atividades,
		 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
		 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
		*/
		
		String grupo1, grupo2, grupo3;
		double poluicao;
		
		System.out.println("\n Entre com um valor");
		poluicao = leia.nextDouble();
		
		if(poluicao>=0.3 && poluicao<0.4) 
		{
			System.out.println("\n As Indústrias do Grupo 01 estão sendo intimadas à suspenderem suas atividades"
					+ "por atingir"+poluicao+" do índice de poluição");
		}
		else if(poluicao>=0.4 && poluicao<0.5) 
		{
			System.out.println("\n As Indústrias do Grupo 01 e Grupo 02 estão sendo intimadas à suspenderem suas atividades"
					+ "por atingir"+poluicao+" do índice de poluição");
		}
		else if(poluicao>=0.5) 
		{
			System.out.println("\n Todas as Indústrias do Grupo 01 e Grupo 02 e Grupo 03 estão sendo intimadas à suspenderem suas atividades"
					+ "por atingir"+poluicao+" do índice de poluição");
		}
		else 
		{
			System.out.println("\n Nenhuma Indútria será notificada");
		}
	}

}
