package Java_dan15_Dom_AutoriKnjiga;

import java.util.ArrayList;
/*
Domaci:
Napraviti klasu Knjiga koja ima atribute: naslov, broj strana, i godina izdavanja.
Napraviti klasu Pisac koja ima atribute: ime, godina rođenja, i lista knjiga (lista objekata klase Knjiga).
Napraviti metode:
najpoznatijaKnjiga() -> koja vraća naslov knjige sa najvećim brojem strana.
vremePisanja() -> koja vraća razliku između godine izdavanja prve i poslednje knjige.
Napraviti klasu Romanopisac koji nasledjuje klasu Pisac i specifična metoda je:
dugometrazniRoman() -> vraća "dugometražni roman" ako knjiga ima više od 500 strana.
Napraviti klasu Pesnik koji nasledjuje klasu Pisac i ima metodu:
brojZbirki() -> koja vraća broj knjiga koje imaju manje od 100 strana (pretpostavljamo da su zbirke poezije kraće).
Napraviti klasu Esesista koja nasledjuje klasu Pisac i dodati metodu:
kratkiEseji() -> vraća broj eseja (knjiga) koji imaju manje od 50 strana.
 */
public class Main {
    public static void main(String[] args) {
        Knjiga k = new Knjiga("Pekam", 49, 1980);
        Knjiga k1 = new Knjiga("Milena", 501, 1978);
        Knjiga k2 = new Knjiga("Ptice", 89, 1970);
        ArrayList<Knjiga> lKnjiga = new ArrayList<>();
        lKnjiga.add(k);
        lKnjiga.add(k1);
        lKnjiga.add(k2);
        Pisac p = new Pisac("Pavic", 1945, lKnjiga);
        Romanopisac r = new Romanopisac("Crnjanski", 1930, lKnjiga);
        Pesnik pe = new Pesnik("Eric",1940,lKnjiga);
        Esejista e = new Esejista("Esa",1960,lKnjiga);

        System.out.println(lKnjiga);
        System.out.println(p.najpoznatijaKnjiga());
        System.out.println(p.vremePisanja());
        r.dugometrazniRoman();
        System.out.println(pe.brojZbirki());
        System.out.println(e.kratkiEseji());
    }
}
