package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @Test
    void vratiPozivni() {
        Grad g = Grad.valueOf("SARAJEVO");
        Imenik i = new Imenik();
        String x = i.vratiPozivniBroj(g);
        assertEquals(033,x);

    }

}