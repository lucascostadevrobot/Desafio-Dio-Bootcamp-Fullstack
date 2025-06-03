package org.example.service;

import org.example.enums.TipoCartao;
import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.Pedido.PedidoCliente;


import java.util.List;

public class PedidoService {

    public void Processarpedido(PedidoCliente pedidoCliente) {
        double novoLimiteContaCorrente = 0d;
        List<Cartao> cartaoList = pedidoCliente.getContaOrigem().getCartaos();
        double valorCompra = pedidoCliente.getValorCompra();
        TipoPagamento tipoPagamento = pedidoCliente.getTipoPagamento();

        switch (tipoPagamento) {
            case CARTAO_DEBITO, PIX -> {
                if (pedidoCliente.getContaOrigem().isVerificaSaldo()) {
                    novoLimiteContaCorrente = pedidoCliente.getContaOrigem().getSaldoConta() - valorCompra;
                    pedidoCliente.getContaOrigem().setSaldoConta((int) novoLimiteContaCorrente);
                }
            }
            case CARTAO_DE_CREDITO -> {
                for (Cartao cartao : cartaoList) {
                    if (cartao.getTipoCartaoList().contains(TipoCartao.CARTAO_CREDITO)) {
                        double novoLimiteCartaoCredito = cartao.getLimiteCartao() - valorCompra;
                        cartao.setLimiteCartao((int) novoLimiteCartaoCredito);
                    }
                }
            }
        }
    }
}
