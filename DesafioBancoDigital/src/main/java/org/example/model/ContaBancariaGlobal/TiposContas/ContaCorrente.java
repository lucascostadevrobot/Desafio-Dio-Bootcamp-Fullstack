package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.enums.TipoPagamento;
import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import java.util.List;


public class ContaCorrente extends Conta {
    Clientes clientes;
    Conta conta;
    TipoPagamento tipoPagamento;

    public ContaCorrente(Integer numeroConta, Integer saldoConta, String titularConta, Clientes clientes, Cartao cartao,  Conta conta, TipoPagamento tipoPagamento) {
        super(numeroConta, saldoConta, titularConta, clientes, cartao);
        this.conta = conta;
        this.tipoPagamento = tipoPagamento;
    }


    @Override
    public Clientes getClientes() {
        return clientes;
    }

    @Override
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }


    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
