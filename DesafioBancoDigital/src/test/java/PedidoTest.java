import org.example.enums.TipoCartao;
import org.example.enums.TipoPagamento;
import org.example.model.ContaBancariaGlobal.Cartoes.Cartao;
import org.example.model.ContaBancariaGlobal.TiposContas.ContaCorrente;
import org.example.model.Pedido.PedidoCliente;
import org.example.service.PedidoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;


public class PedidoTest {

    private Cartao criaCartoes() {
        Cartao cartao = new Cartao(
                "232",
                20000
        );
        cartao.setTipoCartaoList(Collections.singletonList(TipoCartao.CARTAO_DEBITO));
        return cartao;
    }


    @Test
    void verificaTipoPedido() {

        /*Verifica o tipo de Pagamento para o Pedido em questão*/
        {

            //Insntacia Conta Corrente...
            ContaCorrente contaCorrente = new ContaCorrente(
                    TipoPagamento.CARTAO_DEBITO,
                    List.of(criaCartoes()));
            contaCorrente.setSaldoConta(200);

            //Instancia PedidoCliente para não dar PointerNullExpecption..
            PedidoCliente pedidoCliente = new PedidoCliente();
            pedidoCliente.setValorCompra(200);
            pedidoCliente.setTipoPagamento(TipoPagamento.CARTAO_DEBITO);
            pedidoCliente.setContaOrigem(contaCorrente);

            //Instancia PedidoService...
            PedidoService pedidoService = new PedidoService();
            pedidoService.Processarpedido(pedidoCliente);

            //Espero que seja 1 o resultado de conta corrente e cartão de débito...
            Assertions.assertEquals(TipoPagamento.CARTAO_DEBITO, contaCorrente.getTipoPagamento());
        }

    }
}



