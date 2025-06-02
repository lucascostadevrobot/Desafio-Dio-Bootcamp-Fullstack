package org.example.service;

import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrenteService {
    ContaCorrente contaCorrente;



    public List<Cartao> isVerificaCartoes(){
        List<Cartao> cartaoList = new ArrayList<>();
        for (Cartao cartao : contaCorrente.getCartaos()){
            cartaoList.add(cartao);
            return cartaoList;
        }
        return cartaoList;
    }



    public void pagamentoContas() {

    }
}
