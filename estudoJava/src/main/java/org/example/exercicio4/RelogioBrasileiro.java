package org.example.exercicio4;

public class RelogioBrasileiro extends Relogio{

    @Override
    public String retornaHoraFormatada() {
        return String.format("%02d:%02d:%02d",
                getHora(),
                getMinuto(),
                getSegundo());
    }

    @Override
    public void converter(Relogio relogio) {
        setHora(relogio.getHora());
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());
    }
}
