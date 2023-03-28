package org.example;

public class Cliente {
    private NotaFiscal notaFiscal;
    private HistoricoCompra historicoCompra;

    public Cliente (FabricaAbstrata fabrica) {
        this.notaFiscal = fabrica.createNotaFiscal();
        this.historicoCompra = fabrica.createHistoricoCompra();
    }

    public String emitirNotaFiscal() {
        return this.notaFiscal.emitir();
    }

    public String emitirHistoricoCompra() {
        return this.historicoCompra.emitir();
    }
}
