package Exercicios01_Condicionais;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		/* A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o
		 * altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25.
		 * Se o �ndice sobe para 0,3 as ind�strias do 1o grupo s�o intimadas a suspenderem suas atividades,
		 * se o �ndice crescer para 0,4 as industrias do 1o e 2o grupo s�o intimadas a suspenderem suas atividades,
		 * se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
		 * Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
		*/
		
		String grupo1, grupo2, grupo3;
		double poluicao;
		
		System.out.println("\n Entre com um valor");
		poluicao = leia.nextDouble();
		
		if(poluicao>=0.3 && poluicao<0.4) 
		{
			System.out.println("\n As Ind�strias do Grupo 01 est�o sendo intimadas � suspenderem suas atividades"
					+ "por atingir"+poluicao+" do �ndice de polui��o");
		}
		else if(poluicao>=0.4 && poluicao<0.5) 
		{
			System.out.println("\n As Ind�strias do Grupo 01 e Grupo 02 est�o sendo intimadas � suspenderem suas atividades"
					+ "por atingir"+poluicao+" do �ndice de polui��o");
		}
		else if(poluicao>=0.5) 
		{
			System.out.println("\n Todas as Ind�strias do Grupo 01 e Grupo 02 e Grupo 03 est�o sendo intimadas � suspenderem suas atividades"
					+ "por atingir"+poluicao+" do �ndice de polui��o");
		}
		else 
		{
			System.out.println("\n Nenhuma Ind�tria ser� notificada");
		}
	}

}
