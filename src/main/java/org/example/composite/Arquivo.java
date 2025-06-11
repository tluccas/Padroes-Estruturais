package org.example.composite;

public class Arquivo implements ArquivoComposite{

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir(){
        System.out.println("Abrindo arquivo: " + nome);
    }
}
