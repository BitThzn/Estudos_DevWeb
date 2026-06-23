// Sistema +18

package pratica04;

//======IMPORTS======//
import java.util.Scanner;
//===================//

public class Main {
    
    public static void main(String[] args){

        //   ---Variaveis---
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
                if (idade >=18){
                    System.out.print("Bem-vindo");
                }
                else {
                    System.out.print("Usuario não é maior de idade.");
                }
    sc.close();
    }
}
