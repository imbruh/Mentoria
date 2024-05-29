package Condicionais;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um caractere:");
        char caractere = scanner.next().charAt(0);
        
        if (Character.isLetter(caractere)) {
            if (isVogal(caractere)) {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else if (Character.isDigit(caractere)) {
            System.out.println("É um número.");
        } else {
            System.out.println("É um caractere especial.");
        }
        
        scanner.close();
    }
    
    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}