package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Conta extends Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer numeroConta;
    @Column
    private Integer saldoConta;
    @Column
    private String titularConta;
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Cartao> cartaoList;

    public Conta(Integer numeroConta, Integer saldoConta, String titularConta, List<Cartao> cartaoList) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.titularConta = titularConta;
        this.cartaoList = cartaoList;
    }

    public Conta() {
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Integer saldoConta) {
        this.saldoConta = saldoConta;
    }


    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public List<Cartao> getCartaoList() {
        return cartaoList;
    }

    public void setCartaoList(List<Cartao> cartaoList) {
        this.cartaoList = cartaoList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(saldoConta, conta.saldoConta) && Objects.equals(titularConta, conta.titularConta) && Objects.equals(cartaoList, conta.cartaoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroConta, saldoConta, titularConta, cartaoList);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldoConta=" + saldoConta +
                ", titularConta='" + titularConta + '\'' +
                ", cartaoList=" + cartaoList +
                '}';
    }

    public boolean isVerificaSaldo() {
        if (saldoConta > 0) {
            return true;
        }
        return false;
    }
}
