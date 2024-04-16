package org.example;

public class Cafe implements Bebida {

    public float valorTotal;

    public Cafe() {
    }

    public Cafe(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public String getProduto() {
        return "Café";
    }
}
