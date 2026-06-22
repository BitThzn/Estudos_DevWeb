package pratica03;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String skill = "";

        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua Classe: ");
        
        String classe = sc.nextLine();

        System.out.println("Digite sua Arma: ");
        String arma = sc.nextLine();

        boolean localValido = false;

        while (!localValido) {
            System.out.println("Onde você deseja nascer? (Taverna / Cidade)");
            String spawn = sc.nextLine();

            if (spawn.equalsIgnoreCase("Taverna")) {
                System.out.println("Você nasceu na Taverna!");
                localValido = true; // Define como true para encerrar o loop
            } else if (spawn.equalsIgnoreCase("Cidade")) {
                System.out.println("Você nasceu na Cidade!");
                localValido = true; // Define como true para encerrar o loop
            } else {
                System.out.println("Você precisa nascer em algum lugar válido... Tente novamente.");
                // Não muda o 'localValido', então o loop continua
            }
        }

        if (classe.equalsIgnoreCase("Guerreiro")) {
            skill = "Lâmina de fogo"; // A lamina fica em chamas e da mais dano
        }
        else if (classe.equalsIgnoreCase("Mago")) {
            skill = "Bola de fogo"; // uma enorme bola de fogo surge do cajado do mago e é arremessada na direção do inimigo
        }
        else if (classe.equalsIgnoreCase("Arqueiro")) {
            skill = "Chuva de flechas"; // uma chuva de flechas cai do ceu
        }
        else if (classe.equalsIgnoreCase("Assassino")) {
            skill = "Manipulação de sombras"; // o assasino pode manipular sombras, usar elas para se teletransportar, e usa-las como clones (Zed)
        }
        else if (classe.equalsIgnoreCase("Curandeiro")) {
            skill = "Cajado da Luz"; // Uma forte luz sai do cajado do curandeiro, cegando inimigos e curando todos em volta (o assasino nao pode utilizar suas skills enquanto o curandeiro usa sua skill)
        }
        else if (classe.equalsIgnoreCase("Clerigo")) {
            skill = "O punho de Deus"; // O punho de deus deixa o clerigo com muita força e resistencia, capaz de derrubar qualquer inimigo com qualquer arma, ele cura levemente seus aliados numa area de 5m 
        }

        else if (classe.equalsIgnoreCase("Escudeiro")) {
            skill = "Escudo de Thorin"; // Uma grande aurea de escudo dourado e formado em volta do escudo utilizado pelo escudeiro, nada passa por ele.
        }
        else {
            skill = "Classe desconhecida";
        }
    
        int nivel = random.nextInt(20) + 1;

        String titulo;
            if (nivel <= 5) {
                titulo = "Novato";
            }
            else if (nivel <= 10) {
                titulo = "Aventureiro";
            }
            else if (nivel <=15) {
                titulo = "Veterano";
            }
            else {
                titulo = "lendario";
            }

        System.out.println("===== Ficha =====");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Arma: " + arma);
        System.out.println("Poder Especial: " + skill);
        System.out.println("Seu nivel é: " + nivel);
        System.out.println("Título: " + titulo);

        sc.close();
    }
}


//  ~Ghost, The Shadow~ 
