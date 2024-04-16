package org.example;

public class Leite extends BebidaDecorator{

    public Leite(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualValorBebida() {
        return 15.0f;
    }
    public String getNomeProduto() {
        return "com Leite";
    }
}
