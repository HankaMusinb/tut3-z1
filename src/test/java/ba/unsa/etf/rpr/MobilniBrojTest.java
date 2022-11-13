package ba.unsa.etf.rpr;

import org.junit.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {
    @Test
    void testiramoMetoduIspisi(){
        MobilniBroj broj = new MobilniBroj(060, "785968");
        assertArrayEquals("060/785968",broj.Ispisi());
    }

    private void assertArrayEquals(String s, String ispisi) {
    }

}