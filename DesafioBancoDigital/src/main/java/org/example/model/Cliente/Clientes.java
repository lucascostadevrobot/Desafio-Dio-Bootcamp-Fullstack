package org.example.model.Cliente;

import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String sobreNome;
    @Column
    private String cpf;
    @OneToOne(cascade = CascadeType.PERSIST)
    Conta conta;
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Cartao> cartao;

    public Clientes(String nome, String sobreNome, String cpf, Conta conta, List<Cartao> cartao) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.conta = conta;
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


    public List<Cartao> getCartao() {
        return cartao;
    }

    public void setCartao(List<Cartao> cartao) {
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
