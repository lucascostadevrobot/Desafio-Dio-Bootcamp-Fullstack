package org.example.service;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;

import javax.swing.*;

public class ContaCorrenteService {
    ContaCorrente contaCorrente;


    public void pagamentoContas( ) {
        TipoPagamento tipoPagamento = contaCorrente.getTipoPagamento();
        switch (tipoPagamento) {
            case CARTAO_DE_CREDITO -> {
                if (contaCorrente.getCartao().getLimiteCartao() <= 0 && contaCorrente.getCartao().getLimiteCartao() < pedido.valorCompra) {
                    JOptionPane.showMessageDialog(null, "Limite insuficiente");
                } else {
                    int novoLimiteCartaoCredito = contaCorrente.getCartao().getLimiteCartao() - pedido.valorCompra;
                    contaCorrente.getCartao().setLimiteCartao(novoLimiteCartaoCredito);
                    JOptionPane.showMessageDialog(null, "Limite disponível: " + novoLimiteCartaoCredito);
                }
            }
            case PIX -> {
                if(contaCorrente.isVerificaSaldo()){
                    int novoSaldoConta = contaCorrente.getSaldoConta() - pedido.valorCompra;
                    contaCorrente.setSaldoConta(novoSaldoConta);
                }
            }
        }
    }
}
