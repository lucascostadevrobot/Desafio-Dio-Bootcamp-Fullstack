package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import java.util.List;
import java.util.Objects;


public class ContaCorrente extends Conta {

    private TipoPagamento tipoPagamento;
    private List<Cartao> cartaos;

    public ContaCorrente(TipoPagamento tipoPagamento, List<Cartao> cartaos) {
        super();
        this.tipoPagamento = tipoPagamento;
        this.cartaos = cartaos;
    }


    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public List<Cartao> getCartaos() {
        return cartaos;
    }

    public void setCartaos(List<Cartao> cartaos) {
        this.cartaos = cartaos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContaCorrente that = (ContaCorrente) o;
        return tipoPagamento == that.tipoPagamento && Objects.equals(cartaos, that.cartaos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoPagamento, cartaos);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "tipoPagamento=" + tipoPagamento +
                ", cartaos=" + cartaos +
                ", cartaoList=" + cartaoList +
                '}';
    }
}
