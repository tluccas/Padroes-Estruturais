package org.example.bridge;

public class NotaFiscalFinal extends NotaFiscal {

    public NotaFiscalFinal(MeioEmissao meioEmissao){
        super(meioEmissao);
    }
    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        meioEmissao.emitir(cliente, valor);
    }
}
