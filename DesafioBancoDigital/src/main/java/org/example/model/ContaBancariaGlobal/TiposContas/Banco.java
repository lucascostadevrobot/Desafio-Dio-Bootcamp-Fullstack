package org.example.model.ContaBancariaGlobal.TiposContas;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String agencia;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Conta> contas;

    public Banco(String nome, String agencia) {
        this.nome = nome;
        this.agencia =  agencia;
    }

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nome, banco.nome) && Objects.equals(agencia, banco.agencia) && Objects.equals(contas, banco.contas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, agencia, contas);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", contas=" + contas +
                '}';
    }
}
