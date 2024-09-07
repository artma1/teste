//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
//seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("STRING");
        System.out.println("Digite uma palavra ou frase:");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int numA = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
                numA++;
            }
        }
        if (numA != 0) {
            System.out.println("A letra 'a' existe e é encontrada " + numA +
                    " vezes na string.");
        } else {
            System.out.println("A letra 'a' não existe na string.");
        }
    }
}