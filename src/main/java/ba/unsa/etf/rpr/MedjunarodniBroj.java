package ba.unsa.etf.rpr;

public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava;


    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String Ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
