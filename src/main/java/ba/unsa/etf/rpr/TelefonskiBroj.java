package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj {
    protected String broj;
    public TelefonskiBroj(String broj) {
        this.broj = broj;
    }

    protected TelefonskiBroj() {
    }

    public abstract String  Ispisi();
    public abstract int hashCode();
    public String getBroj(){
        return broj;
    }
    public boolean equals(Object o){
        TelefonskiBroj provjeri = (TelefonskiBroj)o;
        return broj.equals(provjeri.getBroj());
    }
}
