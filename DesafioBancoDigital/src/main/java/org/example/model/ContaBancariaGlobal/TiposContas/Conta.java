package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import javax.swing.*;
import java.util.Objects;

public class Conta extends Banco{
    private Integer numeroConta;
    private Integer saldoConta;
    private String titularConta;
    private Clientes clientes;
    Cartao cartao;

    public Conta(Integer numeroConta, Integer saldoConta, String titularConta, Clientes clientes, Cartao cartao) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.titularConta = titularConta;
        this.clientes = clientes;
        this.cartao = cartao;
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


    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
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
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(saldoConta, conta.saldoConta)  && Objects.equals(titularConta, conta.titularConta)  && Objects.equals(clientes, conta.clientes) && Objects.equals(cartao, conta.cartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, saldoConta, titularConta,  clientes, cartao);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldoConta=" + saldoConta +
                ", titularConta='" + titularConta + '\'' +
                ", clientes=" + clientes +
                ", cartao=" + cartao +
                '}';
    }

    public void Depositar() {

    }

    public void Sacar() {

    }

    public void trasferirSaldo() {

    }

    public boolean isVerificaSaldo() {
        if (saldoConta > 0) {
            JOptionPane.showMessageDialog(null, "Saldo disponível: " + saldoConta);
        }else {
            return false;
        }
        return true;
    }
}
