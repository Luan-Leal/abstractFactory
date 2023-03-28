package org.example;

public class FabricaDados implements FabricaAbstrata{
    @Override
    public NotaFiscal createNotaFiscal() {
        return new NotaFiscalMes();
    }

    @Override
    public HistoricoCompra createHistoricoCompra() {
        return new HistoricoComprasMes();
    }
}
