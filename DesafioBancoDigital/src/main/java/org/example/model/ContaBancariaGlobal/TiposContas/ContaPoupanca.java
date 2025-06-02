package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import java.util.Objects;

public class ContaPoupanca extends Conta {
    private boolean vinculada;
    Cartao cartao;

    public ContaPoupanca(Integer numeroConta, Integer saldoConta, Integer agenciaConta, String titularConta, boolean vinculada, Cartao cartao) {
        super(numeroConta, saldoConta, agenciaConta, titularConta);
        this.vinculada = vinculada;
        this.cartao = cartao;
    }

    public boolean isVinculada() {
        return vinculada;
    }

    public void setVinculada(boolean vinculada) {
        this.vinculada = vinculada;
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
        ContaPoupanca that = (ContaPoupanca) o;
        return vinculada == that.vinculada && Objects.equals(cartao, that.cartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vinculada, cartao);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "vinculada=" + vinculada +
                ", cartao=" + cartao +
                '}';
    }
}
