package Java_dan12_Dom_Banka;

import java.util.Scanner;

public class BankovniRacun {
    int jedBrojRacuna;
    String imeVlasnika;
    double trStanje;

    public BankovniRacun(int jedBrojRacuna, String imeVlasnika, int trStanje) {
        this.jedBrojRacuna = jedBrojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.trStanje = trStanje;
    }

    public double uplata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite iznos za uplatu: ");
        double iznos = sc.nextDouble();
        if (iznos > 0) {
            trStanje += iznos;
        } else {
            System.out.println("Pogresan unos, iznos za uplatu mora biti veci od 0 din.");
        }
        return trStanje;
    }

    public double isplata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite iznos za isplatu: ");
        double iznos = sc.nextDouble();
        if (iznos > 0 ) {
            trStanje -= iznos;
        } else {
            System.out.println("Pogresan unos, iznos za isplatu mora biti veci od 0 din.");
        }
        return trStanje;
    }

    public String toString() {
        return jedBrojRacuna + " " + imeVlasnika + " " + trStanje + " din.";
    }
}
