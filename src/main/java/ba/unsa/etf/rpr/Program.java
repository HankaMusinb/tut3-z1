package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Imenik imenik = new Imenik();
        System.out.println("Za pozivanje metoda koristiti redom brojeve:\n 1 - dodaj \n 2 - dajBroj \n 3 - dajIme " +
                "\n 4 - naSlovo \n 5 - izGrada \n 6 - izGradaBrojevi \n\t 0 - KRAJ");
        Scanner ulaz = new Scanner(System.in);
        int metoda = ulaz.nextInt();
        while(metoda != 0){
            String ime, telefonskiBroj,drzava;
            Grad grad;
            int mobilnamreza;
            System.out.println("Unesite ime.\n");
            Scanner ulaz1 = new Scanner(System.in);
            ime = ulaz1.nextLine();
            System.out.println("Unesite grad.\n");
            Scanner ulaz2 = new Scanner(System.in);
            grad = Grad.valueOf(ulaz2.next());
            System.out.println("Unesite drzavu.\n");
            Scanner ulaz3 = new Scanner(System.in);
            drzava = ulaz3.nextLine();
            System.out.println("Unesite broj.\n");
            Scanner ulaz4 = new Scanner(System.in);
            telefonskiBroj = ulaz4.nextLine();
            System.out.println("Unesite mobilnu mrezu.\n");
            Scanner ulaz5 = new Scanner(System.in);
            mobilnamreza = ulaz5.nextInt();
            System.out.println("Odaberite da li je broj Fiksni(1), ¸Mobilni(2), Medunarodni(3)");
            int instancaBroja = ulaz1.nextInt();

            if(metoda == 1){
                if(instancaBroja == 1){
                    FiksniBroj broj = new FiksniBroj( grad,telefonskiBroj);
                    imenik.dodaj(ime,broj);
                    System.out.println(imenik);
                }else if (instancaBroja == 2){
                    MobilniBroj broj = new MobilniBroj(mobilnamreza,telefonskiBroj);
                    imenik.dodaj(ime,broj);
                }else{
                    MedjunarodniBroj broj = new MedjunarodniBroj(drzava, telefonskiBroj);
                    imenik.dodaj(ime,broj);
                }
            }else if(metoda == 2){
                if(instancaBroja == 1){
                    System.out.println(new FiksniBroj( grad,telefonskiBroj));

                }else if (instancaBroja == 2){
                    System.out.println( new MobilniBroj(mobilnamreza,telefonskiBroj));

                }else{
                    System.out.println( new MedjunarodniBroj(drzava, telefonskiBroj));

                }
            }else if(metoda == 3){
                System.out.println(imenik.dajIme(ime));
            }


        }
    }

}