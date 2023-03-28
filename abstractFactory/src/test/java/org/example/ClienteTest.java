package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveEmitirHistoricoCompra() {
        FabricaAbstrata fabrica = new FabricaDados();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico de compras de Março de 2023", cliente.emitirHistoricoCompra());
    }

    @Test
    void deveEmitirNotaFiscal() {
        FabricaAbstrata fabrica = new FabricaDados();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Listagem das notas fiscais geradas em Março de 2023: ", cliente.emitirNotaFiscal());
    }
}
