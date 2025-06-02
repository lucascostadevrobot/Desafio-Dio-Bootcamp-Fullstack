package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import java.util.Objects;


public class ContaCorrente extends Conta {
    private TipoPagamento tipoPagamento;
    Cartao cartao;


    public ContaCorrente(Integer numeroConta, Integer saldoConta, Integer agenciaConta, String titularConta, TipoPagamento tipoPagamento, Cartao cartao) {
        super(numeroConta, saldoConta, agenciaConta, titularConta);
        this.tipoPagamento = tipoPagamento;
        this.cartao = cartao;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContaCorrente that = (ContaCorrente) o;
        return tipoPagamento == that.tipoPagamento && Objects.equals(cartao, that.cartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoPagamento, cartao);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "tipoPagamento=" + tipoPagamento +
                ", cartao=" + cartao +
                '}';
    }
}
