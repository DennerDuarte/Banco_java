package br.com.fiap.contasModel;
import br.com.fiap.Exception.SaldoInsuficiente;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, int nrConta, double saldo, TipoConta tipoConta) {
        super(nome, nrConta, saldo, tipoConta);
    }

}
