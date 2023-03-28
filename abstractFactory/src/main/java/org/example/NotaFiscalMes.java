package org.example;

public class NotaFiscalMes implements NotaFiscal{
    @Override
    public String emitir() {
        return "Listagem das notas fiscais geradas em Março de 2023: ";
    }
}
