package org.example;

import org.example.model.Cliente.Clientes;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.Conta;
import org.example.model.Pedido.PedidoCliente;


import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ExecutionPedidoCliente {
    public static void main(String[] args) {
        processarPedidoCliente();

    }

    public static void processarPedidoCliente() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mCODO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        JTextField nomeField = new JTextField();
        JTextField sobrenomeField = new JTextField();
        JTextField cpfField = new JTextField();

        //Instancia e incialização
        Cartao cartao = new Cartao("252", 10000);
        List<Cartao> cartaoList = new ArrayList<>();
        cartaoList.add(cartao);
        Cartao[] arrayDeCartoesObjeto = cartaoList.toArray(new Cartao[0]);

        //Cria o dropw Input Dialog para listar os cartões disponiveis
        JComboBox<Cartao> cartaoJComboBox = new JComboBox<>(arrayDeCartoesObjeto);

        //Cria um array de objetos para passar os dados para o formulario
        Object[] formulario = {
                "Nome", nomeField,
                "Sobrenome:", sobrenomeField,
                "cpf:", cpfField,
                "Cartões disponíveis: ", cartaoJComboBox
        };

        int opcao = JOptionPane.showConfirmDialog(null, formulario, "Realizar pagamento?", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION){
            PedidoCliente pedidoCliente = new PedidoCliente();
            Clientes clientes = new Clientes();

            String nomeCliente =  pedidoCliente.getContaOrigem().getTitularConta();
        }


        entityManager.getTransaction().begin();


        entityManager.close();
        entityManagerFactory.close();
    }
}
