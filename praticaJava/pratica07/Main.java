package pratica07;

//===IMPORTS===//
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
            double fstnumber = sc.nextDouble();
            //fstnumber = first number

        System.out.println("Digite o segundo número:");
            double secnumber = sc.nextDouble();
            //secnumber = secund number
        
        System.out.println("Soma: " + (fstnumber + secnumber));
        System.out.println("Subtração: " + (fstnumber - secnumber));
        System.out.println("Multiplicação: " + (fstnumber * secnumber));
        System.out.println("divisão: " + (fstnumber / secnumber));

         sc.close();
    }
}
