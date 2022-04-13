package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String escolha;
    }

    public void run() {
        int escolha;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("\n\n");
            System.out.println("1 - Escreva a palavra que pretende traduzir:");
            System.out.println("2 - Listar palavras disponiveis");
            System.out.println("3 - Adicionar uma palavra à lista");
            System.out.println("4 - Sair");

            escolha = ler.nextInt();
            if (escolha == 1) {
            } else if (escolha == 2) {
            } else if (escolha == 3) {
            }
        } while (escolha != 4);
    }
}