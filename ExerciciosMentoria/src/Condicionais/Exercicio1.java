package Condicionais;

import java.util.Map;

public class Exercicio1 {

	public static void main(String[] args) {
		 Integer idadeNadador1 = 15;
		 Integer idadeNadador2 = 23;
		 Integer idadeNadador3 = 6;
		 
		  Map<String, Integer> lista = Map.of("nadador1", idadeNadador1,
							                  "nadador2", idadeNadador2,
							                  "nadador3", idadeNadador3);
		 
		 for (Map.Entry<String, Integer> entry : lista.entrySet()) {
	            String nomeNadador = entry.getKey();
	            Integer idade = entry.getValue();
	            System.out.println("A classificação do " + nomeNadador + " é: " + verificarClassificacao(idade));
	        }
		 
	}
	
	private static String verificarClassificacao(int idade) {
		String classificacao = "Não é permitido menores de 5 anos.";
					
		if(idade >=18) {
			classificacao = "adulto";
		}
		else if(idade >=14) {
			classificacao = "juvenil B";
		}
		else if(idade >=11) {
			classificacao = "juvenil A";
		}
		else if(idade >=8) {
			classificacao = "infantil B";
		}
		else if(idade >= 5) {
			classificacao = "infantil A";
		}
		
		return classificacao;
	}
}
