package com.fornazeiro;

public class Empregado {

    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    //assinatura trabalha com o tipo do dado e nao com o nome. Nao posso criar mais de um construtor com o mesmo tipo de assinatura.
//    public Empregado(String nome, int idade, int tipo, double salario, double comissao, double bonus) {
//        this.nome = nome;
//        this.idade = idade;
//        this.tipo = tipo;
//        this.salario = salario;
//        this.comissao = comissao;
//        this.bonus = bonus;
//    }

    public double calcularSalario(){
        if (tipo == 1){
            return salario;
        }
        else if (tipo == 2){
            return salario + salario * comissao;
        }
        else if (tipo == 3){
            return salario + bonus;
        }
        else{
            return 0.;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipo=" + tipo +
                ", salario=" + salario +
                ", comissao=" + comissao +
                ", bonus=" + bonus +
                '}';
    }
}
