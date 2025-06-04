package org.example.model.Pedido;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;

import javax.persistence.*;

@Entity
public class PedidoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private double valorCompra;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pagamento")
    private TipoPagamento tipoPagamento;

    @OneToOne
    private ContaCorrente contaOrigem;
    @Column
    private boolean aprovado;


    public PedidoCliente(double valorCompra, TipoPagamento tipoPagamento, ContaCorrente contaOrigem, boolean aprovado) {
        this.valorCompra = valorCompra;
        this.tipoPagamento = tipoPagamento;
        this.contaOrigem = contaOrigem;
        this.aprovado = aprovado;

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


    @Override
    public String toString() {
        return "PedidoCliente{" +
                "valorCompra=" + valorCompra +
                ", tipoPagamento=" + tipoPagamento +
                ", contaOrigem=" + contaOrigem +
                ", aprovado=" + aprovado +
                '}';
    }
}
