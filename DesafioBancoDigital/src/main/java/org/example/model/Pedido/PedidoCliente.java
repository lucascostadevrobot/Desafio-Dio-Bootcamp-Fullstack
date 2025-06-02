package org.example.model.Pedido;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;

public class PedidoCliente {

    private double valorCompra;
    private TipoPagamento tipoPagamento;
    private ContaCorrente contaOrigem;
    private boolean aprovado;
    private Conta conta;

    public PedidoCliente(double valorCompra, TipoPagamento tipoPagamento, ContaCorrente contaOrigem, boolean aprovado, Conta conta) {
        this.valorCompra = valorCompra;
        this.tipoPagamento = tipoPagamento;
        this.contaOrigem = contaOrigem;
        this.aprovado = aprovado;
        this.conta = conta;
    }

    public PedidoCliente() {
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ContaCorrente getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaCorrente contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "PedidoCliente{" +
                "valorCompra=" + valorCompra +
                ", tipoPagamento=" + tipoPagamento +
                ", contaOrigem=" + contaOrigem +
                ", aprovado=" + aprovado +
                ", conta=" + conta +
                '}';
    }
}
