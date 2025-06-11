package org.example.bridge;

public abstract class NotaFiscal {

    protected MeioEmissao meioEmissao;

    public NotaFiscal(MeioEmissao meioEmissao) {
        this.meioEmissao = meioEmissao;
    }

    public abstract void emitir(String cliente, double valor);
}