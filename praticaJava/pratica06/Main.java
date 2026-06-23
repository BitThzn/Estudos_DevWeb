package pratica06;


//===IMPORTS===//
import java.util.Scanner;
//=============//


public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digeite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("=== D A D O S ===");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            }
            else {
                System.out.println("Você não é maior de idade");
            }

    sc.close();
    }
}
