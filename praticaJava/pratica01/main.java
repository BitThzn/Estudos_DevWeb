import java.util.Scanner;

public class  main {

    public static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
            String nome = sc.nextLine();

        System.out.print("Digite sua Idade: ");
            int idade = sc.nextInt(); 

            sc.nextLine();  // limpa o Enter pendente qque fica salvo no "nextInt" :)

        System.out.print("Digite seu cidade: ");
            String cidade = sc.nextLine();

            
        System.out.println("Olá, " + nome);
        System.out.println("Vc tem " + idade);
        System.out.println("Vc mora em " + cidade);

        sc.close();
    }
}