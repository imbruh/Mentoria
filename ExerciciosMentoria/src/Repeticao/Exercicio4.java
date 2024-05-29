package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int canal5 = 0, canal7 = 0, canal10 = 0, canal12 = 0;
		
		int quantidadePessoasGeral = 0;

		while(true) {
			System.out.printf("\nNúmero do canal: ");
			int canal = ler.nextInt();
			
			if(canal == 0) break;
			
			System.out.printf("Número de pessoas assistindo: ");
			int quantidadePessoas = ler.nextInt();
			
			switch (canal) {
            case 5:
                canal5 += quantidadePessoas;
                break;
            case 7:
                canal7 += quantidadePessoas;
                break;
            case 10:
                canal10 += quantidadePessoas;
                break;
            case 12:
                canal12 += quantidadePessoas;
                break;
            default:
                System.out.println("Canal inexistente.");
                break;
			}

			quantidadePessoasGeral += quantidadePessoas;
		}
		

        System.out.println("\nPorcentagem de audiência por canal:");
        System.out.println("Canal 5: " + String.format("%.2f", calcularPorcentagem(canal5, quantidadePessoasGeral)) + "%");
        System.out.println("Canal 7: " + String.format("%.2f", calcularPorcentagem(canal7, quantidadePessoasGeral)) + "%");
        System.out.println("Canal 10: " + String.format("%.2f", calcularPorcentagem(canal10, quantidadePessoasGeral)) + "%");
        System.out.println("Canal 12: " + String.format("%.2f", calcularPorcentagem(canal12, quantidadePessoasGeral)) + "%");
	}
	
	private static double calcularPorcentagem(int canal, int totalPessoas){
		return (canal / (double) totalPessoas) * 100;
	}
}


