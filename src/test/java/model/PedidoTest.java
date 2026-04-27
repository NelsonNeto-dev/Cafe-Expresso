package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveAdicionarProduto() {
        Pedido pedido = new Pedido();
        Produto produto = new Produto("Café", 5.0);

        pedido.adicionarProduto(produto);

        assertEquals(5.0, pedido.calcularTotal());
    }

    @Test
    void deveCalcularTotalComVariosProdutos() {
        Pedido pedido = new Pedido();

        pedido.adicionarProduto(new Produto("Café", 5.0));
        pedido.adicionarProduto(new Produto("Pão", 3.0));

        assertEquals(8.0, pedido.calcularTotal());
    }

    @Test
    void totalDeveSerZeroQuandoNaoHaProdutos() {
        Pedido pedido = new Pedido();

        assertEquals(0.0, pedido.calcularTotal());
    }
}
