package org.example.model.Cliente;

import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;

import java.util.Objects;

public class Clientes {
    private String nome;
    private String sobreNome;
    private String cpf;
    Conta conta;
    Cartao cartao;

    public Clientes(String nome, String sobreNome, Conta conta, String cpf, Cartao cartao) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.conta = conta;
        this.cpf = cpf;
        this.cartao = cartao;
    }

    public Clientes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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
        Clientes clientes = (Clientes) o;
        return Objects.equals(nome, clientes.nome) && Objects.equals(sobreNome, clientes.sobreNome) && Objects.equals(cpf, clientes.cpf) && Objects.equals(conta, clientes.conta) && Objects.equals(cartao, clientes.cartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobreNome, cpf, conta, cartao);
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                ", cartao=" + cartao +
                '}';
    }
}
