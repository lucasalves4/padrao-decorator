package org.example;

public abstract class BebidaDecorator implements Bebida {

    private Bebida bebida;
    public String produto;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract float getPercentualValorBebida();

    public float getValorTotal() {
        return this.bebida.getValorTotal() * (1 + (this.getPercentualValorBebida() / 100));
    }

    public abstract String getNomeProduto();

    public String getProduto() {
        return this.bebida.getProduto() + " " + this.getNomeProduto();
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
