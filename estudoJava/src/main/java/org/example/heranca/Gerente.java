package org.example.heranca;

public class Gerente extends Colaborador {
    private String login;
    private String senha;
    private double comissão;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }
}
