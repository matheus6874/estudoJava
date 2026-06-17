package org.example.exercicio4;

public class RelogioAmericano extends Relogio{
    private boolean pm;

    @Override
    public String retornaHoraFormatada() {
        String periodo = pm ? " PM" : " AM";
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo()) + periodo;
    }
    @Override
    public void converter(Relogio relogio) {
        pm = relogio.getHora() >= 12;
        int hora = relogio.getHora();

        if (hora == 0) {
            hora = 12;
        } else if (hora > 12) {
            hora -= 12;
        }

        setHora(hora);
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());


    }

    @Override
    public void setHora(int hora) {
        if (hora < 1 || hora > 12) {
            throw new IllegalArgumentException(
                    "Relógio americano aceita apenas horas de 1 a 12");
        }

        super.setHora(hora);
    }
}
