//1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre
// será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número, ele calcule a
// sequência de Fibonacci e retorne uma mensagem avisando se o número
// informado pertence ou não a sequência.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("FIBONACCI");
        System.out.print("Digite o número para checagem: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calcFibonacci(num));
    }

    public static String calcFibonacci(int num) {

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.addFirst(0);
        fibonacci.add(1);
        int result = 0;
        int temp1, temp2;
        int i = 2;
        while (result <= num) {
            temp2 = fibonacci.get(i-2);
            temp1 = fibonacci.get(i-1);
            result = temp1 + temp2;
            fibonacci.add(result);
            i++;
            if (result == num) {
                System.out.println("Sequência: " + fibonacci);
                return "O número '" + num + "' informado pertence à sequência.";
            }
        }
        System.out.println("Sequência: " + fibonacci);
        return "O número '" + num + "' informado não pertence à sequência.";
    }
}