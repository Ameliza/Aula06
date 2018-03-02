package poo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TesteDeValidação {
    //O teste de validação serve para saber se colocando tal valor na entrada, tenha a saída desejada

    @Test
    public void testarSoma(){

        Aritmetica p = new Aritmetica();

        assertEquals("Erro na soma", 3, p.soma(1,2));   //para 1 + 2, espera-se que a saída seja 3
        assertEquals("Erro na soma", 0, p.soma(-2,2));

    }

    //CONTINUAR::::::::::
    @Test
    public void testarDivisao(){

        Aritmetica p = new Aritmetica();

        assertEquals("Erro na soma", 3, p.soma(1,2));   //para 1 + 2, espera-se que a saída seja 3
        assertEquals("Erro na soma", 0, p.soma(-2,2));

    }
}
