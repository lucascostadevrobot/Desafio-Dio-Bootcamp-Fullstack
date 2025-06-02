package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.enums.TipoPagamento;
import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import java.util.List;
import java.util.Objects;


public class ContaCorrente extends Conta {
    Clientes clientes;
    TipoPagamento tipoPagamento;
    List<Cartao> cartaos;

    public ContaCorrente(Integer numeroConta, Integer saldoConta, String titularConta, Clientes clientes, Cartao cartao,  TipoPagamento tipoPagamento, List<Cartao> cartaos) {
        super(numeroConta, saldoConta, titularConta, clientes, cartao);
        this.tipoPagamento = tipoPagamento;
        this.cartaos = cartaos;
    }



    @Override
    public Clientes getClientes() {
        return clientes;
    }

    @Override
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
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
        return Objects.equals(clientes, that.clientes) && tipoPagamento == that.tipoPagamento && Objects.equals(cartaos, that.cartaos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clientes,tipoPagamento, cartaos);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "clientes=" + clientes +
                ", tipoPagamento=" + tipoPagamento +
                ", cartaos=" + cartaos +
                ", cartao=" + cartao +
                '}';
    }
}
