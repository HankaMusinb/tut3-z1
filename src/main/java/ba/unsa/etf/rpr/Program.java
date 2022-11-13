package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Za pozivanje metoda koristiti redom brojeve:\n 1 - dodaj \n 2 - dajBroj \n 3 - dajIme " +
                "\n 4 - naSlovo \n 5 - izGrada \n 6 - izGradaBrojevi \n\t 0 - KRAJ");
        Scanner ulaz = new Scanner(System.in);
        int metoda = ulaz.nextInt();
        while(metoda != 0){
            if(metoda == 1){
                System.out.println("Unesite ime.\n");
                String ime, telefonskiBroj;
                Scanner ulaz1 = new Scanner(System.in);
                ime = ulaz1.nextLine();
                System.out.println("Odaberite da li je broj Fiksni(1), ¸Mobilni(2), Medunarodni(3)");
                int instancaBroja = ulaz1.nextInt();
                /*if(instancaBroja == 1){
                    System.out.println("Unesite sada glavni grad kantona u kojem zelite da registrujete broj.\n");
                }
                Imenik imenik = new Imenik();
                imenik.dodaj(ime, );*/
            }
        }
    }
}