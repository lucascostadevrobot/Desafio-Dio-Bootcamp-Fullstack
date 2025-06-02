package org.example.service;

import org.example.enums.TipoCartao;
import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;
import org.example.model.Pedido.PedidoCliente;


import java.util.List;

public class PedidoService {
    PedidoCliente pedidoCliente;
    ContaCorrente contaCorrente;
    TipoPagamento tipoPagamento;
    private double valorCompra;


    public void pedido (){
        double novoLimiteContaCorrente = 0d;
        List<Cartao> cartaoList = contaCorrente.getCartaos();
        switch (tipoPagamento){
            case CARTAO_DEBITO, PIX -> {
               if (contaCorrente.isVerificaSaldo()){
                    novoLimiteContaCorrente = contaCorrente.getSaldoConta() - valorCompra;
                   contaCorrente.setSaldoConta((int) novoLimiteContaCorrente);
               }
            }
            case CARTAO_DE_CREDITO -> {
               for (Cartao cartao: cartaoList){
                    if (cartao.getTipoCartaoList().contains(TipoCartao.CARTAO_CREDITO)){
                        double novoLimiteCartaoCredito = cartao.getLimiteCartao() - valorCompra;
                        cartao.setLimiteCartao((int) novoLimiteCartaoCredito);
                    }
               }
            }
        }
    }
}
