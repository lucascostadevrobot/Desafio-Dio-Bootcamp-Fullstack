package org.example.model.ContaBancariaGlobal.TiposContas;

import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;

import javax.swing.*;
import java.util.Objects;

public class Conta {
    private Integer numeroConta;
    private Integer saldoConta;
    private Integer agenciaConta;
    private String titularConta;
    private Banco banco;
    private Clientes clientes;
    private Cartao cartao;

    public Conta(Integer numeroConta, Integer saldoConta, Integer agenciaConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.agenciaConta = agenciaConta;
        this.titularConta = titularConta;
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

    public Integer getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(Integer agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
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
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(saldoConta, conta.saldoConta) && Objects.equals(agenciaConta, conta.agenciaConta) && Objects.equals(titularConta, conta.titularConta) && Objects.equals(banco, conta.banco) && Objects.equals(clientes, conta.clientes) && Objects.equals(cartao, conta.cartao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, saldoConta, agenciaConta, titularConta, banco, clientes, cartao);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldoConta=" + saldoConta +
                ", agenciaConta=" + agenciaConta +
                ", titularConta='" + titularConta + '\'' +
                ", banco=" + banco +
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
