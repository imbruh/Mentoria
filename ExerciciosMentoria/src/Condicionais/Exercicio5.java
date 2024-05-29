package Condicionais;

import java.util.Scanner;

public class Exercicio5{
	static Double valorDiaria;
	
	public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
		  String hospede, tipoApto;
		  int diarias;
		  Double consumoInterno;
		  System.out.printf("Nome do hóspede: ");
		  hospede = ler.nextLine();
		 
		  System.out.printf("Tipo do Apto: ");
		  tipoApto = ler.nextLine();
		 
		  System.out.printf("Num. diarias: ");
		  diarias = ler.nextInt();
		 
		  System.out.printf("Valor consumo interno: ");
		  consumoInterno = ler.nextDouble();
		 
		  Double valorTotalDiarias = getValorTotalDiaria(tipoApto, diarias);
		 
		  Double valorSubtotal = getValorSubtotal(valorTotalDiarias, consumoInterno);
		  Double valorTaxaServico = getValorTaxaServico(valorSubtotal);
		  Double valorTotalGeral = getValorTotalGeral(valorSubtotal, valorTaxaServico);
		 
		  String retornoFormatado = formatarSaidaInformacoes(hospede, tipoApto, diarias, valorTotalDiarias, consumoInterno, valorSubtotal, valorTaxaServico, valorTotalGeral);
		  System.out.println(retornoFormatado);
	}
	
	private static Double getValorTotalDiaria(String tipoApto, int diarias) {
		switch(tipoApto) {
			case "A":
				valorDiaria = 150.0;
				break;
			case "B":
				valorDiaria = 100.0;
				break;
			case "C":
				valorDiaria = 75.0;
				break;
			case "D":
				valorDiaria = 50.0;
				break;
		}
		
		return valorDiaria * diarias;
	}
	
	private static Double getValorSubtotal(Double valorTotalDiarias, Double valorConsumoInterno) {
		return valorTotalDiarias + valorConsumoInterno;
	}
	private static Double getValorTaxaServico(Double valorSubtotal) {
		return valorSubtotal * 0.10;
	}
	
	private static Double getValorTotalGeral(Double valorSubtotal, Double valorTaxaServico) {
		return valorSubtotal + valorTaxaServico;
	}
	
	private static String formatarSaidaInformacoes(String hospede, String tipoApto, int diarias, Double valorTotalDiarias,
			Double valorConsumoInterno, Double valorSubtotal, Double valorTaxaServico, Double valorTotalGeral) {
		return "\n==== CONTA ===="
				+ "\nNome do hóspede: " + hospede
				+ "\nTipo do Apartamento: " + tipoApto
				+ "\nNum diarias: " + diarias
				+ "\nValor unitário da diaria: " + valorDiaria
				+ "\nValor total das diarias: " + valorTotalDiarias
				+ "\nValor do consumo interno: " + valorConsumoInterno
				+ "\nValor do Subtotal: " + valorSubtotal
				+ "\nValor da taxa de serviço: " + valorTaxaServico
				+ "\nValor do total geral: " + valorTotalGeral;
	}
}
