package org.example.exercicio1;

public class Conta {

    private double saldo;
    private double limiteChequeEspecial;
    private double saldoChequeEspecial;
    private double valorUsadoChequeEspecial;

    public Conta(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.saldoChequeEspecial = this.limiteChequeEspecial;
        this.valorUsadoChequeEspecial = 0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite total do cheque especial: R$ %.2f%n", limiteChequeEspecial);
        System.out.printf("Limite disponível: R$ %.2f%n", saldoChequeEspecial);
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        // Se existe dívida do cheque especial, cobra primeiro
        if (valorUsadoChequeEspecial > 0) {

            double taxa = valorUsadoChequeEspecial * 0.20;
            double dividaTotal = valorUsadoChequeEspecial + taxa;

            System.out.printf(
                    "Foi cobrada uma taxa de R$ %.2f pelo uso do cheque especial.%n",
                    taxa
            );

            if (valor >= dividaTotal) {

                valor -= dividaTotal;

                saldoChequeEspecial = limiteChequeEspecial;
                valorUsadoChequeEspecial = 0;

            } else {

                valorUsadoChequeEspecial -= valor;

                saldoChequeEspecial += valor;

                System.out.println(
                        "Depósito utilizado para amortizar a dívida do cheque especial."
                );

                return;
            }
        }

        saldo += valor;

        System.out.printf("Depósito realizado com sucesso. Novo saldo: R$ %.2f%n", saldo);
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        double totalDisponivel = saldo + saldoChequeEspecial;

        if (valor > totalDisponivel) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        if (valor <= saldo) {

            saldo -= valor;

        } else {

            double valorUsadoDoCheque = valor - saldo;

            saldo = 0;
            saldoChequeEspecial -= valorUsadoDoCheque;
            valorUsadoChequeEspecial += valorUsadoDoCheque;

            System.out.printf(
                    "Foram utilizados R$ %.2f do cheque especial.%n",
                    valorUsadoDoCheque
            );
        }

        System.out.println("Saque realizado com sucesso.");
    }

    public void pagarBoleto(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        double totalDisponivel = saldo + saldoChequeEspecial;

        if (valor > totalDisponivel) {
            System.out.println("Saldo insuficiente para pagar o boleto.");
            return;
        }

        if (valor <= saldo) {

            saldo -= valor;

        } else {

            double valorUsadoDoCheque = valor - saldo;

            saldo = 0;
            saldoChequeEspecial -= valorUsadoDoCheque;
            valorUsadoChequeEspecial += valorUsadoDoCheque;

            System.out.printf(
                    "Foram utilizados R$ %.2f do cheque especial para pagar o boleto.%n",
                    valorUsadoDoCheque
            );
        }

        System.out.println("Boleto pago com sucesso.");
    }

    public void verificarUsoChequeEspecial() {

        if (valorUsadoChequeEspecial > 0) {
            System.out.printf(
                    "A conta está utilizando R$ %.2f do cheque especial.%n",
                    valorUsadoChequeEspecial
            );
        } else {
            System.out.println("A conta não está utilizando cheque especial.");
        }
    }
}