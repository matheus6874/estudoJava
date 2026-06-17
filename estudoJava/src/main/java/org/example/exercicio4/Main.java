package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new RelogioBrasileiro();
        Relogio relogioAmericano = new RelogioAmericano();

        relogio.setHora(22);
        relogio.setMinuto(47);
        relogio.setSegundo(30);
        System.out.println(relogio.retornaHoraFormatada());

        relogioAmericano.setHora(9);
        relogioAmericano.setMinuto(47);
        relogioAmericano.setSegundo(30);
        System.out.println(relogioAmericano.retornaHoraFormatada());

        relogioAmericano.converter(relogio);
        System.out.println(relogioAmericano.retornaHoraFormatada());




    }
}
