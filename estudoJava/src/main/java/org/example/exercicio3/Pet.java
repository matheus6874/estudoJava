package org.example.exercicio3;

public class Pet {
    private boolean estaLimpo;
    private boolean estaNaMaquina;

    public Pet() {
        this.estaLimpo = false;
    }

    public boolean isEstaNaMaquina() {
        return estaNaMaquina;
    }

    public void setEstaNaMaquina(boolean estaNaMaquina) {
        this.estaNaMaquina = estaNaMaquina;
    }

    public boolean isEstaLimpo() {
        return estaLimpo;
    }

    public void setEstaLimpo(boolean estaLimpo) {
        this.estaLimpo = estaLimpo;
    }


}
