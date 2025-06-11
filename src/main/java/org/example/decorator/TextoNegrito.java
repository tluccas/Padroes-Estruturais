package org.example.decorator;

public class TextoNegrito extends TextoDecorator {
    public TextoNegrito(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<b>" + super.formata() + "</b>";    }
}
