package br.com.fiap.contasModel;

import br.com.fiap.Exception.SaldoInsuficiente;

public class Conta {

    private String nome;
    private int nrConta;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(String nome, int nrConta, double saldo, TipoConta tipoConta) {
        this.nome = nome;
        this.nrConta = nrConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void sacar(double valor) throws SaldoInsuficiente {
        if (valor > saldo) {
            throw new SaldoInsuficiente("Saldo insuficiente para realizar o saque");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de :" + valor + "R$ realizado. Saldo em conta: " + saldo);
    }
}


