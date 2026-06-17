package org.example.heranca;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Gerente gerente = new Gerente();

        gerente.setNome("Matheus");
        gerente.setLogin("matheus");
        gerente.setSenha("321312");

        System.out.println(gerente.getNome());
        System.out.println(gerente.getLogin());
        System.out.println(gerente.getSenha());
    }

}
