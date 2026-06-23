package pratica08;

//===IMPORT==//
import java.util.Scanner;
//===========//

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the student name: ");
        String name = sc.nextLine();
        System.out.println("Type the first grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Type the second grade: ");
        double grade2 = sc.nextDouble();
        System.out.println("Type the third grade: ");
        double grade3 = sc.nextDouble();

        if (grade1 < 0 || grade1 > 10 ||
            grade2 < 0 || grade2 > 10 ||
            grade3 < 0 || grade3 > 10) {

            System.out.println("Invalid grade!");
        } else {

            double media = (grade1 + grade2 + grade3) / 3;

            System.out.printf("The average of %s is %.2f%n", name, media);
            //se a media for 8.666666666666666 usando o "%.2f%n" ele mostra apenas 8.67
        }

        sc.close();
    }
}
