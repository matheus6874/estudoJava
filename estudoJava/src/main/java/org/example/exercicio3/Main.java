package org.example.exercicio3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanhoPet maquinaBanhoPet = new MaquinaBanhoPet();
        Pet pet = new Pet();
        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nivel de água");
            System.out.println("5 - Verificar nivel de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("10 - Verificar máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            switch (opcao) {

                case 1:
                    maquinaBanhoPet.darBanho(pet);
                    break;

                case 2:
                    maquinaBanhoPet.abastecerAgua();
                    break;

                case 3:
                    maquinaBanhoPet.abastecerShampoo();
                    break;

                case 4:
                    maquinaBanhoPet.verificarAgua();
                    break;

                case 5:
                    maquinaBanhoPet.verificarShampoo();
                    break;

                case 6:
                    maquinaBanhoPet.verificarPetNaMaquina();
                    break;

                case 7:
                    maquinaBanhoPet.colocarPetNaMaquina(pet);
                    break;

                case 8:
                    maquinaBanhoPet.retirarPetDaMaquina(pet);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                case 9:
                    maquinaBanhoPet.limparMaquina();
                    break;
                case 10:
                    maquinaBanhoPet.verificarMaquinaSuja();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
