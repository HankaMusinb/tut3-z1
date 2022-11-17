package ba.unsa.etf.rpr;

import org.junit.Test;
//import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;

 public class MobilniBrojTest {
    @Test
    public void testiramoMetoduIspisi(){
        MobilniBroj broj = new MobilniBroj(060, "785968");
        assertEquals("067/785968",broj.Ispisi());
    }



}