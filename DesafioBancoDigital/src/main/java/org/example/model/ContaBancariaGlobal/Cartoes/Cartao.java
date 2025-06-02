package org.example.model.ContaBancariaGlobal.Cartoes;

import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;

import java.util.Objects;

public class Cartao {
    private String codigoCV;
    private Integer limiteCartao;
    Conta conta;
    Clientes clientes;

    public Cartao(String codigoCV, Integer limiteCartao) {
        this.codigoCV = codigoCV;
        this.limiteCartao = limiteCartao;

    }

    public Cartao() {
    }

    public String getCodigoCV() {
        return codigoCV;
    }

    public void setCodigoCV(String codigoCV) {
        this.codigoCV = codigoCV;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Integer getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(Integer limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cartao cartao = (Cartao) o;
        return Objects.equals(codigoCV, cartao.codigoCV) && Objects.equals(limiteCartao, cartao.limiteCartao) && Objects.equals(conta, cartao.conta) && Objects.equals(clientes, cartao.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCV, limiteCartao, conta, clientes);
    }


}
