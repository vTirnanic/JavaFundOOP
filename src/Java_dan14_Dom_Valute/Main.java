package Java_dan14_Dom_Valute;
/*
Domaci:
Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
Osnovna Klasa: Valuta
promenljive: naziv , simbol, i kurs.
Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare koristeci trenutni kurs valute.
Dolar:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
Euro:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve, i vrsi konverziju odredjenih
iznosa iz jedne valute u drugu.
 */
public class Main {
    public static void main(String[] args) {

        Valuta v = new Valuta("Marka","DM",60);
        System.out.println(v);
        System.out.println(v.konvertujUdinare(100)+ " din.");

        // Valuta v1 = (Valuta) new Object(); instaciranje klase kao objekat,
        // svaka klasa onda nasledjuje klasu objekat

        Dolar d = new Dolar(105);
        System.out.println(d);
        System.out.println(d.konvertujUdinare(100) + " din.");
        d.postaviKursNovi(110);
        System.out.println(d.konvertujUdinare(100) + " din.");

        Evro e = new Evro(118);
        System.out.println(e);
        System.out.println(e.konvertujUdinare(100)+ " din.");
        e.postaviKursNovi(130);
        System.out.println(e.konvertujUdinare(100) + " din.");

    }
}
