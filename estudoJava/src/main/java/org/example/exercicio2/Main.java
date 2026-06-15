package org.example.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Subir marcha");
            System.out.println("8 - Reduzir marcha");
            System.out.println("9 - Verificar velocidade");
            System.out.println("10 - Verificar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    carro.ligar();
                    break;

                case 2:
                    carro.desligar();
                    break;

                case 3:
                    carro.acelerar();
                    break;

                case 4:
                    carro.diminuirVelocidade();
                    break;

                case 5:
                    carro.virarEsquerda();
                    break;

                case 6:
                    carro.virarDireita();
                    break;

                case 7:
                    carro.subirMarcha();
                    break;

                case 8:
                    carro.reduzirMarcha();
                    break;

                case 9:
                    carro.verificarVelocidade();
                    break;

                case 10:
                    carro.verificarMarcha();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}