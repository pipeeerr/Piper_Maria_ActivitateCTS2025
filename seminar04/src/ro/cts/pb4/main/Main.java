package ro.cts.pb4.main;

import ro.cts.pb4.classes.ARezervare;
import ro.cts.pb4.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("Maria", 4, "20.03.25", "21:30");

        ARezervare rezervare1 = rezervare.copiaza();
        ARezervare rezervare2 = rezervare.copiaza();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
