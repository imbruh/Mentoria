package Condicionais;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as quatro notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        
        double media = calcularMediaDesconsiderandoMenor(nota1, nota2, nota3, nota4);
        
        System.out.println("A média das três maiores notas é: " + media);
        
    }
    
    public static double calcularMediaDesconsiderandoMenor(double nota1, double nota2, double nota3, double nota4) {
        double menorNota = Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
        
        if (menorNota == nota1) {
            return (nota2 + nota3 + nota4) / 3.0;
        } else if (menorNota == nota2) {
            return (nota1 + nota3 + nota4) / 3.0;
        } else if (menorNota == nota3) {
            return (nota1 + nota2 + nota4) / 3.0;
        } else {
            return (nota1 + nota2 + nota3) / 3.0;
        }
    }
}
