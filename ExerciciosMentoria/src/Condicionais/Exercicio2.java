package Condicionais;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
		  String operador;
		  Double numero1, numero2;
		 
		  System.out.printf("Digite o operador: ");
		  operador = ler.nextLine();
		  System.out.printf("Digite o primeiro numero: ");
		  numero1 = ler.nextDouble();
		  System.out.printf("Digite o segundo numero: ");
		  numero2 = ler.nextDouble();
		  	 
		  Double resultado = realizarOperacao(numero1, numero2, operador);
		 		
		 
		  if(resultado == null) {
			  System.out.println("\nOperador desconhecido");
		  }
		  else {
			  System.out.format("\n%s %s %s = %s", numero1, operador, numero2, resultado);
		  }
	}
	
	private static Double realizarOperacao(Double numero1, Double numero2, String operador) {
		Double resultado;
			
		switch(operador) {
		  case "+":
			  resultado =  numero1 + numero2;
			  break;
		  case "-":
			  resultado =  numero1 - numero2;
			  break;
		  case "*":
			  resultado =  numero1 * numero2;
			  break;
		  case "/":
			  resultado =  numero1 / numero2;
			  break; 
		  case "%":
			  resultado =  numero1 % numero2;
			  break; 
		  default:
			  resultado = null;
			  break;  
		}
		
		return resultado;
	}
}
