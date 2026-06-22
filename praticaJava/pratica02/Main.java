package pratica02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Olá, " + nome);
        System.out.println("Vc tem " + idade + " anos");
        System.out.println("Seu peso é de " + peso);
        System.out.println("e sua altura atual é de " + altura);
        
        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc );
        
        if (imc <= 18.4) {
            System.out.println("Voce está abaixo do peso");
        }

        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Voce está com o peso normal");
        }

        else {
             System.out.println("Voce está com sobrepeso");
        }

        sc.close();
    }
}
