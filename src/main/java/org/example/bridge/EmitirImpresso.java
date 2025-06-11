package org.example.bridge;

public class EmitirImpresso implements MeioEmissao{

    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Imprimindo localmente...");
    }
}
