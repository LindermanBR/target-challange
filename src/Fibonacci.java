import java.util.Scanner;

public class Fibonacci {
    /*
     * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
     * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
     * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
     * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
     * avisando se o número informado pertence ou não a sequência.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacciNumber(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

    }

    public static boolean isFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int previous = 0;
        int current = 1;
        int sum = 0;

        while (sum < n) {
            sum = previous + current;
            previous = current;
            current = sum;
        }

        return sum == n;
    }
}
