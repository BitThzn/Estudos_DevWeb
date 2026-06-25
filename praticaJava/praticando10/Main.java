package praticando10;

import java.util.Scanner;

public class Main {
    
    public static double calcularMedia(double n1, double n2) {

        return (n1 + n2) / 2;
    }

    public static String verificarSituacao(double media) {

        if (media >= 7) {
            return ("aprovado");
        }
            return ("reprovado");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
            double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
            double n2 = sc.nextDouble();
        
        double resultado = calcularMedia(n1, n2); 
        String situacao = verificarSituacao(resultado);
        System.out.println("Média: " + resultado);
        System.out.println("Situação: " + situacao);
        
        sc.close();
    }

}
