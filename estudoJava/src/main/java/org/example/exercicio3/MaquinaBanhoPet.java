package org.example.exercicio3;

public class MaquinaBanhoPet {
    private boolean estaEmBanho;
    private int litros;
    private int shampoo;
    private boolean temPetNaMaquina;
    private boolean maquinaSuja;

    public MaquinaBanhoPet() {
        this.litros = 30;
        this.shampoo = 10;
    }

    public void darBanho(Pet pet){
        if (!temPetNaMaquina) {
            System.out.println("Não existe pet na máquina.");
            return;
        }
        if(estaEmBanho){
            System.out.println("A máquina de banho já está em uso");
        }else if (this.litros < 10 || this.shampoo < 2){
            System.out.println("Não tem água ou shampoo suficiente para o banho");
        }else {
            this.estaEmBanho = true;
            this.litros -= 10;
            this.shampoo -= 2;
            pet.setEstaLimpo(true);
            this.estaEmBanho = false;
            System.out.println("Banho realizado com sucesso.");
        }
    }

    public void abastecerAgua(){
        if(this.litros <= 28){
            this.litros += 2;
            System.out.println("Água abastecida.");
        }else{
            System.out.println("Tanque de água já está cheio.");
        }
    }

    public void abastecerShampoo(){
        if(this.shampoo <= 8){
            this.shampoo += 2;
            System.out.println("Shampoo abastecido.");
        }else{
            System.out.println("Reservatório de shampoo já está cheio.");
        }
    }

    public void limparMaquina(){
        if(this.litros < 3 || this.shampoo < 1){
            System.out.println("Não é possível realizar a limpeza da máquina, shammpo ou água insuficiente");
        }else {
            this.litros -= 3;
            this.shampoo -= 1;
            this.estaEmBanho = false;
            this.maquinaSuja = false;
            System.out.println("Máquina limpa com sucesso.");
        }
    }

    public void verificarAgua(){
        System.out.println("Nível de água:" + this.litros);
    }

    public void verificarShampoo(){
        System.out.println("Nível de shampoo:" + this.shampoo);
    }

    public void colocarPetNaMaquina(Pet pet){
        if (maquinaSuja) {
            System.out.println("A máquina precisa ser limpa.");
            return;
        }
        if (this.temPetNaMaquina){
            System.out.println("A máquina está ocupada.");
        }else {
            this.temPetNaMaquina = true;
            pet.setEstaNaMaquina(true);
            pet.setEstaLimpo(false);
        }
    }

    public void retirarPetDaMaquina(Pet pet){

        if (estaEmBanho) {
            System.out.println("Aguarde o término do banho.");
            return;
        }
        if (this.temPetNaMaquina){

            if (!pet.isEstaLimpo()) {
                maquinaSuja = true;
            }

            pet.setEstaNaMaquina(false);
            this.temPetNaMaquina = false;

        }else{
            System.out.println("A máquina está vazia");
        }
    }

    public void verificarPetNaMaquina() {
        if (this.temPetNaMaquina){
            System.out.println("Tem pet na máquina");
        }else {
            System.out.println("Não tem pet na máquina");
        }
    }

    public void verificarMaquinaSuja() {
        if(maquinaSuja){
            System.out.println("A máquina precisa ser limpa.");
        }else{
            System.out.println("A máquina está limpa.");
        }
    }
}
