package org.example.decorator;

public class EditorDeTexto {

    public static void main(String[] args) {

        Texto textoSimples = new TextoSimples("Padrões de projeto");

        Texto textoNegrito = new TextoNegrito(textoSimples);
        Texto textoItalico = new TextoItalico(textoNegrito);
        Texto textoSublinhado = new TextoSublinhado(textoSimples);

        System.out.println("Texto Simples: " + textoSimples.formata());
        System.out.println("Texto Negrito: " + textoNegrito.formata());
        System.out.println("Texto Negrito + Texto Itálico: " + textoItalico.formata());
        System.out.println("Texto Sublinhado: " + textoSublinhado.formata());

    }
}
