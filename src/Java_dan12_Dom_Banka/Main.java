package Java_dan12_Dom_Banka;
/*
Domaci:
Kreirati klasu BankovniRacun koja modeluje bankovni racun. Svaki bankovni racun ima svoj jedinstveni broj, ime vlasnika racuna, i trenutno stanje na racunu.
Implementirati konstruktor koji postavlja vrednosti ovih atributa pri kreiranju racuna.
Dodati metode uplata i isplata koje omogucavaju uplatu i isplatu novca sa racuna.
Obe metode primaju iznos kao argument. Metoda uplata povecava trenutno stanje racuna za dati iznos, dok metoda skidanje smanjuje trenutno stanje racuna.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
sredstava na racunu za skidanje.
Napisati metodu toString koja generise string reprezentaciju objekta, uključujući broj racuna,
ime vlasnika i trenutno stanje na racunu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomocu
metode toString, izvrsiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati azurirane informacije o racunu.
 */
public class Main {
    public static void main(String[] args) {
        BankovniRacun br = new BankovniRacun(54689,"Perica Peric",8000);
        System.out.println(br);
        br.uplata();
        br.isplata();
        br.isplata();
        System.out.println("Trenuto stanje na racunu " + br.jedBrojRacuna + ": " + br.trStanje + " din.");
    }
}
