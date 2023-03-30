package br.edu;

import br.edu.lanche.Lanche;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestaLanche {

    @Test
    public void testaXBacon(){
        int codigo = 3;
        int quantidade = 2;
        double saidaEsperada = 10;

        double repostaObtida = Lanche.calculaValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada, repostaObtida);
    }

    @Test
    public void testaTorradaSimples(){
        int codigo = 4;
        int quantidade = 3;
        double saidaEsperada = 6;

        double repostaObtida = Lanche.calculaValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada, repostaObtida);
    }

    @Test
    public void testaXSalada(){
        int codigo = 2;
        int quantidade = 3;
        double saidaEsperada = 13.5;

        double repostaObtida = Lanche.calculaValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada, repostaObtida);
    }
}
