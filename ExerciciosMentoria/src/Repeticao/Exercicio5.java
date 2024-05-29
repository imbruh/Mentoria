package Repeticao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroSorteado = random.nextInt(100);
		
		
		Scanner ler = new Scanner(System.in);
		int chances = 1;
		
		while(chances <= 5 ) {
			System.out.printf("\nChute um número: ");
			int numeroEscolhido = ler.nextInt();
			
			if(numeroEscolhido == numeroSorteado) {
				System.out.println("Acertou!!");
				break;
			}
			else {
				int diferenca = numeroSorteado - numeroEscolhido;
				
				if(Math.abs(diferenca) > 5 ) {
					System.out.println("Está frio!");
				}
				else {
					System.out.println("Está quente!");
				}
			}
			
			chances++;
		}
		if(chances > 5) {
			System.out.println("Você perdeu");
			System.out.println("numero sorteado: " + numeroSorteado);
			};
	}
}
