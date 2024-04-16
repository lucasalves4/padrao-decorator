package org.example;

public class Chantilly extends BebidaDecorator{

    public Chantilly(Bebida bebida) {
        super(bebida);
    }
    public float getPercentualValorBebida() {
        return 30.0f;
    }
    public String getNomeProduto() {
        return "com Chantilly";
    }
}
