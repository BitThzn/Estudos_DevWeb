package pratica09;

import java.util.Scanner;

public class Main {

    public static int somar(int a, int b) {

        return a + b;
    }

    public static int subtrair(int a, int b) {

        return a - b;
    }

    public static int multiplicar(int a, int b) {

        return a * b;
    }

    public static int dividir(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int a = sc.nextInt();
        System.out.println("digite outro numero");
        int b = sc.nextInt();
        if (b != 0) {
            int resultado4 = dividir(a, b);
            System.out.println("Dividido: " + resultado4);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        int resultado1 = somar(a, b);
        int resultado2 = subtrair(a, b);
        int resultado3 = multiplicar(a, b);
        int resultado4 = dividir(a, b);
        System.out.println("Somado: " + resultado1);
        System.out.println("Subtraido: " + resultado2);
        System.out.println("Multiplicado: " + resultado3);
        System.out.println("Dividido: " + resultado4);

        sc.close();
    }
}
