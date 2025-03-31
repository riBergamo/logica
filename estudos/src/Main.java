import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na
        // tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de A?");
        double A = scanner.nextFloat();

        System.out.println("Valor de B?");
        double B = scanner.nextFloat();

        System.out.println("Valor de C?");
        double C = scanner.nextFloat();

        double soma = A + B;

        System.out.printf(" %.2f\n+%.2f\n------\n %.2f\n", A, B, soma);


        if (soma < C) {
            System.out.printf("A soma %.2f é menor que %.2f.\n", soma, C);
        } else if (soma > C) {
            System.out.printf("A soma %.2f é maior que %.2f.\n", soma, C);
        } else {
            System.out.println("A soma é igual a C.");
        }



    }
}