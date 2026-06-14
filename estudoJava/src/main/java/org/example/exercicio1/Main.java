package org.example.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        double valor = 0;

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu de opções");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar chequeEspecial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando cheque espcial");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consultando saldo");
                    conta.consultarSaldo();
                    break;

                case 2:
                    System.out.println("Consultando cheque especial");
                    conta.consultarChequeEspecial();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;

                case 4:
                    System.out.print("Digite o valor do saque: ");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;

                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                    break;
                case 6:
                   conta.verificarUsoChequeEspecial();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while (opcao != 0);
    }
}
