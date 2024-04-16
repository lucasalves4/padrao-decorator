package org.example;

public class Acucar extends BebidaDecorator {

    public Acucar(Bebida bebida) {
        super(bebida);
    }

    public float getPercentualValorBebida() {
        return 5.0f;
    }

    public String getNomeProduto() {
        return "com Açucar";
    }
}
