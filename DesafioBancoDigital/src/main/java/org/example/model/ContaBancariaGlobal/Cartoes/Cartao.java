package org.example.model.ContaBancariaGlobal.Cartoes;

import org.example.enums.TipoCartao;
import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;

import java.util.List;
import java.util.Objects;

public class Cartao {
    private String codigoCV;
    private Integer limiteCartao;
    Conta conta;
    Clientes clientes;
    List<TipoCartao> tipoCartaoList;

    public Cartao(String codigoCV, Integer limiteCartao) {
        super();
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

    public List<TipoCartao> getTipoCartaoList() {
        return tipoCartaoList;
    }

    public void setTipoCartaoList(List<TipoCartao> tipoCartaoList) {
        this.tipoCartaoList = tipoCartaoList;
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
        return Objects.equals(codigoCV, cartao.codigoCV) && Objects.equals(conta, cartao.conta) && Objects.equals(clientes, cartao.clientes) && Objects.equals(tipoCartaoList, cartao.tipoCartaoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCV, conta, clientes, tipoCartaoList);
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "codigoCV='" + codigoCV + '\'' +
                ", conta=" + conta +
                ", clientes=" + clientes +
                ", tipoCartaoList=" + tipoCartaoList +
                '}';
    }
}
