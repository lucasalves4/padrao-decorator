package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void deveRetornarValorTotalBebida() {
        Bebida bebida = new Cafe(2.0f);

        assertEquals(2.0f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComChantilly() {
        Bebida bebida = new Chantilly(new Cafe(2.0f));

        assertEquals(2.6f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComLeite() {
        Bebida bebida = new Leite(new Cafe(2.0f));

        assertEquals(2.3f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComAcucar() {
        Bebida bebida = new Acucar(new Cafe(2.0f));

        assertEquals(2.1f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComChantillyMaisLeite() {
        Bebida bebida = new Chantilly(new Leite(new Cafe(2.0f)));

        assertEquals(2.9899998f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComChantillyMaisAcucar() {
        Bebida bebida = new Chantilly(new Acucar(new Cafe(2.0f)));

        assertEquals(2.7299998f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComLeiteMaisAcucar() {
        Bebida bebida = new Leite(new Acucar(new Cafe(2.0f)));

        assertEquals(2.4149997f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalBebidaComChantillyMaisLeiteMaisAcucar() {
        Bebida bebida = new Chantilly(new Leite(new Acucar(new Cafe(2.0f))));

        assertEquals(3.1394994f, bebida.getValorTotal());
    }

    @Test
    void deveRetornarNomeProduto() {
        Bebida bebida = new Cafe();

        assertEquals("Café", bebida.getProduto());
    }

    @Test
    void deveRetornarNomeBebidaComChantilly() {
        Bebida bebida = new Chantilly(new Cafe());

        assertEquals("Café com Chantilly", bebida.getProduto());
    }

    @Test
    void deveRetornarNomeBebidaComLeite() {
        Bebida bebida = new Leite(new Cafe());

        assertEquals("Café com Leite", bebida.getProduto());
    }

    @Test
    void deveRetornarNomeBebidaComAcucar() {
        Bebida bebida = new Acucar(new Cafe());

        assertEquals("Café com Açucar", bebida.getProduto());
    }

    @Test
    void deveRetornarNomeBebidaComChantillyMaisLeite() {
        Bebida bebida = new Chantilly(new Leite(new Cafe()));

        assertEquals("Café com Leite com Chantilly", bebida.getProduto());
    }

    @Test
    void deveRetornarNomeBebidaComChantillyMaisLeiteMaisAcucar() {
        Bebida bebida = new Chantilly(new Leite(new Acucar(new Cafe())));

        assertEquals("Café com Açucar com Leite com Chantilly", bebida.getProduto());
    }



}