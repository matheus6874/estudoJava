package org.example.exercicio2;

public class Carro {

    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
            return;
        }

        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro só pode ser desligado em ponto morto e com velocidade 0.");
        }
    }

    public void acelerar() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade == 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        if (!velocidadePermitidaNaMarcha(velocidade + 1, marcha)) {
            System.out.println("Troque de marcha para continuar acelerando.");
            return;
        }

        velocidade++;
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void diminuirVelocidade() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
            return;
        }

        velocidade--;

        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void subirMarcha() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 6) {
            System.out.println("O carro já está na última marcha.");
            return;
        }

        if (!podeSubirMarcha()) {
            System.out.println("Velocidade incompatível para subir a marcha.");
            return;
        }

        marcha++;
        System.out.println("Marcha atual: " + marcha);
    }

    public void reduzirMarcha() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("O carro já está em ponto morto.");
            return;
        }

        if (!podeReduzirMarcha()) {
            System.out.println("Velocidade incompatível para reduzir a marcha.");
            return;
        }

        marcha--;
        System.out.println("Marcha atual: " + marcha);
    }

    public void virarEsquerda() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a esquerda.");
        } else {
            System.out.println("Só é possível virar entre 1 km/h e 40 km/h.");
        }
    }

    public void virarDireita() {

        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a direita.");
        } else {
            System.out.println("Só é possível virar entre 1 km/h e 40 km/h.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void verificarMarcha() {
        System.out.println("Marcha atual: " + marcha);
    }

    private boolean velocidadePermitidaNaMarcha(int velocidade, int marcha) {

        return switch (marcha) {
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }

    private boolean podeSubirMarcha() {

        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 20;
            case 2 -> velocidade >= 40;
            case 3 -> velocidade >= 60;
            case 4 -> velocidade >= 80;
            case 5 -> velocidade >= 100;
            default -> false;
        };
    }

    private boolean podeReduzirMarcha() {

        return switch (marcha) {
            case 1 -> velocidade == 0;
            case 2 -> velocidade <= 40;
            case 3 -> velocidade <= 60;
            case 4 -> velocidade <= 80;
            case 5 -> velocidade <= 100;
            case 6 -> velocidade <= 120;
            default -> false;
        };
    }
}