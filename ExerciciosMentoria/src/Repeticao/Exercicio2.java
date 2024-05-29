package Repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		final String senhaCorreta = "teste123";
		
		Scanner ler = new Scanner(System.in);
		String senhaDigitada = "";
		
		for(int contadorSenha = 0; contadorSenha < 3; contadorSenha++) {
			System.out.printf("Digite sua senha: ");
			senhaDigitada = ler.nextLine();
				
			if(senhaDigitada.length() < 8 && contadorSenha < 2) {
				System.out.println("A senha deve conter 8 caracteres. Tente novamente");
			}
			else if(!senhaDigitada.equals(senhaCorreta) && contadorSenha < 2) {
				System.out.println("Senha incorreta. Tente novamente");
			}
			
		}
		
		if(senhaCorreta.equals(senhaDigitada)) System.out.println("Senha correta! " + senhaCorreta); 
		else System.out.println("Não pode entrar");
	}
}
