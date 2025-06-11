package org.example.bridge;

public class EmitirEmail implements MeioEmissao {

    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Enviando por EMAIL...");
    }
}
