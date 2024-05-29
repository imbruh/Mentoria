package Repeticao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer numero = 1;
		List<Integer> listaNumeros = new ArrayList();
		
		while (numero != 0) {
			System.out.printf("Digite um numero: ");
			numero = ler.nextInt();
			
			listaNumeros.add(numero);
		}
		listaNumeros.remove(listaNumeros.size() - 1);
		
		System.out.println("\nO maior numero digitado foi " + maiorNumero(listaNumeros));
		System.out.println("O menor numero digitado foi " + menorNumero(listaNumeros));
	}
	
	public static Integer maiorNumero(List<Integer> lista) {
		Integer maior = 0;
		
		for (Integer numero : lista) {
			if(numero > maior) {
				maior = numero;
			}
		}
		
		return maior;
	}
	
	public static Integer menorNumero(List<Integer> lista) {
		Integer menor = lista.get(0);
		
		for (Integer numero : lista) {
			if(numero < menor) {
				menor = numero;
			}
		}
		
		return menor;
		
	}
	
	

}
