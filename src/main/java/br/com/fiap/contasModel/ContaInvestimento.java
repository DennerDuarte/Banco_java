package br.com.fiap.contasModel;

import br.com.fiap.Exception.SaldoInsuficiente;

import java.util.Random;

public class ContaInvestimento extends Conta{

    private double porcentagem;


    public ContaInvestimento(String nome, int nrConta, double saldo, TipoConta tipoConta) {
        super(nome, nrConta, saldo, tipoConta);
        this.porcentagem = porcentagem;
    }

    private double gerarPorcentagemAleatoria() {
        Random random = new Random();
        double porcentagem = random.nextDouble();
        porcentagem = Math.round(porcentagem * 100.0) / 100.0;
        return porcentagem;
    }
    public double investir (double saldo, TipoConta tipoConta) throws SaldoInsuficiente {

        if (tipoConta == TipoConta.valueOf("BRONZE") && saldo >= 5000 ){
            saldo = (saldo * porcentagem) + saldo;
            System.out.println("O retorno do investimento foi de: " + porcentagem);
            return saldo;
        }
        if (tipoConta == TipoConta.valueOf("PRATA") && saldo >= 3000 ){
            saldo = (saldo * porcentagem) + saldo;
            System.out.println("O retorno do investimento foi de: " + porcentagem);
            return saldo;
        }
        if (tipoConta == TipoConta.valueOf("OURO") && saldo >= 1500 ){
            saldo = (saldo * porcentagem) + saldo;
            System.out.println("O retorno do investimento foi de: " + porcentagem);
            return saldo;
        }

        throw new SaldoInsuficiente("Saldo Indisponível para realizar o investimento");
    }


}
