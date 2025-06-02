package org.example.model.ContaBancariaGlobal.TiposContas;

import java.util.Objects;

public class Banco {
    private String nome;
    private String agencia;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nome, banco.nome) && Objects.equals(agencia, banco.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, agencia);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}
