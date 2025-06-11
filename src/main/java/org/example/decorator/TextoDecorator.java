package org.example.decorator;

public abstract class TextoDecorator implements Texto{
    protected Texto texto;

    public TextoDecorator(Texto texto){
        this.texto = texto;
    }
    @Override
    public String formata() {
        return texto.formata();
    }
}
