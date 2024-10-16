package Java_dan13_Dom_Banka;

import java.util.Scanner;

public class BankovniRacun {
    private int jedBrojRacuna;
    private String imeVlasnika;
    private double trStanje;

    public BankovniRacun(int jedBrojRacuna, String imeVlasnika, double trStanje) {
        this.jedBrojRacuna = jedBrojRacuna;
        this.imeVlasnika = imeVlasnika;
        this.trStanje = trStanje;
    }

    public int getJedBrojRacuna() {
        return jedBrojRacuna;
    }

    public void setJedBrojRacuna(int noviBrojRacuna) {
        this.jedBrojRacuna = noviBrojRacuna;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String novoImeVlasnika) {
        this.imeVlasnika = novoImeVlasnika;
    }

    public double getTrStanje() {
        return trStanje;
    }

    public void setTrStanje(double novoStanje) {
        this.trStanje = novoStanje;
    }

    public double uplata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite iznos za uplatu: ");
        double iznos = sc.nextDouble();
        if (iznos > 0) {
            setTrStanje(getTrStanje() + iznos);
        } else {
            System.out.println("Pogresan unos, iznos za uplatu mora biti veci od 0 din.");
        }
        return trStanje;
    }

    public double isplata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite iznos za isplatu: ");
        double iznos = sc.nextDouble();
        if (iznos > 0) {
            setTrStanje(getTrStanje() - iznos);
        } else {
            System.out.println("Pogresan unos, iznos za isplatu mora biti veci od 0 din.");
        }
        return trStanje;
    }

    public String toString() {
        return "JBR " + jedBrojRacuna + ", vlasnik " + imeVlasnika + ", trenutno stanje " + trStanje + " din.";
    }
}
