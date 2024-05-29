package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matricula = 2024;
		String nome;
		double nota1;
		double nota2;
		
		while(matricula != 0) {
			System.out.printf("\nDigite a matricula: ");
			matricula = ler.nextInt();
			
			if(matricula == 0) break;
			
			System.out.printf("Digite o nome do aluno: ");
			nome = ler.nextLine();
			System.out.printf("Digite a primeira nota: ");
			nota1 = ler.nextDouble();
			System.out.printf("Digite a segunda nota: ");
			nota2 = ler.nextDouble();
			
			System.out.println("\nO aluno " + nome + " está " + exibirAprovacao(nota1, nota2));
		}	

		System.out.println("Encerrou");
	}
	
	private static String exibirAprovacao(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		
		if(media < 7) return "Reprovado";
		
		return "Aprovado";
	}

}
