// sistema de repetição de numeros
package pratica05;

//======IMPORTS======//
import java.util.Scanner;
//===================//

public class Main {

    public static void main(String[] args) {

        // ---Variaveis---
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) { 
            // I vale 1; se o I for menor q 100; entao I adiciona + 1 (isso ate chegar no 100)
            System.out.println(i);
        }
        sc.close();
    }
}
