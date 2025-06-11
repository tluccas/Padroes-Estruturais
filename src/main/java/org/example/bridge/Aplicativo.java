package org.example.bridge;

public class Aplicativo {

    public static void main(String[] args) {
        MeioEmissao emitirEmail = new EmitirEmail();
        MeioEmissao emitirImpresso = new EmitirImpresso();

        NotaFiscalFinal email = new NotaFiscalFinal(emitirEmail);
        email.emitir("Joao", 175.5);

        NotaFiscalFinal imprimir = new NotaFiscalFinal(emitirImpresso);
        imprimir.emitir("Maria", 60.30);
    }
}
