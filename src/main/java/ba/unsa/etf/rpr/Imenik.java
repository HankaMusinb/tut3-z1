package ba.unsa.etf.rpr;

import java.util.*;
import java.util.stream.Collectors;
public class Imenik   {

    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik(){
        imenik = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    public String dajIme(String ime) {
        return imenik.get(ime).Ispisi();
    }

    public  String dajBroj(TelefonskiBroj broj){
       for (var kljuc: imenik.keySet()){
           if(imenik.get(kljuc).equals(broj)){
               return kljuc;
           }
       }
       return null;
    }

    public String naSlovo(char s){
        String zaIspis = "";
        int brojac = 1;
        for(var kljuc : imenik.keySet()) {
            if (kljuc.startsWith(String.valueOf(s))) {
                zaIspis = zaIspis + brojac + ". " + kljuc + " - " + imenik.get(kljuc).Ispisi() + "\n";
                brojac = brojac + 1;
            }
        }
        return zaIspis;
    }

    /**
     * potrebno je u novi set imenaIzGrada sortirati imena i prezimena po gradu koji se nalazi po pozivnom broju
     * @param g
     * @return
     */
    Set<String> izGrada(Grad g){
        Set<String> imenaIzGrada = new HashSet<>();
       String pozivni = vratiPozivniBroj(g);
       for (var x: imenik.keySet()) {
           if (imenik.containsValue(pozivni)) {
               imenaIzGrada.add(imenik.keySet().toString());
           }
       }

        return imenaIzGrada;
    }

    public String vratiPozivniBroj(Grad grad) {
        if (grad.equals(Grad.SARAJEVO))
            return "033";
        else if (grad.equals(Grad.ZENICA))
            return "032";
        else if (grad.equals(Grad.TRAVNIK))
            return "030";
        else if (grad.equals(Grad.BIHAC))
            return "037";
        else if (grad.equals(Grad.ORASJE))
            return "031";
        else if (grad.equals(Grad.GORAZDE))
            return "038";
        else if (grad.equals(Grad.TUZLA))
            return "035";
        else if (grad.equals(Grad.SIROKI_BRIJEG))
            return "039";
        else if (grad.equals(Grad.LIVNO))
            return "034";
        else if (grad.equals(Grad.BRCKO))
            return "049";
        return "036";
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> brojevi = new HashSet<>();
        return brojevi;
    }
    @Override
    public int hashCode() {
        return 0;
    }
}
