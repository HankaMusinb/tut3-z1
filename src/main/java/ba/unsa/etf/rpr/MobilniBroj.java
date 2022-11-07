package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj) {
        super(broj);
        this.mobilnaMreza=mobilnaMreza;
    }
    @Override
    public String Ispisi() {
        if(mobilnaMreza==60)
            return "060/"+broj;
        else if(mobilnaMreza==61)
            return "061/"+broj;
        else if(mobilnaMreza==62)
            return "062/"+broj;
        else if(mobilnaMreza==63)
            return "063/"+broj;
        else if(mobilnaMreza==64)
            return "064/"+broj;
        else if(mobilnaMreza==65)
            return "065/"+broj;
        else if(mobilnaMreza==66)
            return "066/"+broj;
        return "067/"+broj;
    }
    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
