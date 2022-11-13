package ba.unsa.etf.rpr;

public  class FiksniBroj extends TelefonskiBroj {
    private Grad grad;


    public FiksniBroj( Grad grad, String broj) {
        if(grad.equals(Grad.SARAJEVO)){
            throw new izuzetak("Moj izuzetak");
        }
        this.grad = grad;
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    @Override
    public String Ispisi() {
        if(grad.equals(Grad.SARAJEVO))
            return "033/"+broj;
        else if(grad.equals(Grad.ZENICA))
            return "032/"+broj;
        else if(grad.equals(Grad.TRAVNIK))
            return "030/"+broj;
        else if(grad.equals(Grad.BIHAC))
            return "037/"+broj;
        else if(grad.equals(Grad.ORASJE))
            return "031/"+broj;
        else if(grad.equals(Grad.GORAZDE))
            return "038/"+broj;
        else if(grad.equals(Grad.TUZLA))
            return "035/"+broj;
        else if(grad.equals(Grad.SIROKI_BRIJEG))
            return "039/"+broj;
        else if(grad.equals(Grad.LIVNO))
            return "034/"+broj;
        else if(grad.equals(Grad.BRCKO))
            return "049/"+broj;
        return "036/"+broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }


}
