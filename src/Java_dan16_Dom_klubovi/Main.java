package Java_dan16_Dom_klubovi;

import java.util.ArrayList;

/*
Domaci:
Napraviti klasu Igrac koja ima atribute: ime, godine iskustva, i broj postignutih poena.
Napraviti klasu Klub koja ima atribute: naziv, grad, i lista igraca (lista objekata klase Igrac).
Napraviti metode:
- najiskusnijiIgrac() -> vraca ime igrača sa najvise godina iskustva.
- ukupnoPoena() -> vraća ukupan broj poena koje su postigli svi igrači u klubu.
- vrednostTima() -> vraca vrednost tima (apstraktan metod)
Napraviti klasu KosarkaskiKlub koja nasleđuje klasu Klub, i dodati specifičnu metodu:
- sampionTima() -> vraća ime igraca koji ima više od 1000 postignutih poena.
Napraviti klasu FudbalskiKlub koja nasleđuje klasu Klub, i dodati metodu:
- najboljiStrelac() -> vraca ime igraca sa najvise postignutih golova (golove cemo interpretirati kao
postignute poene).
Napraviti klasu OdbojkaškiKlub koja nasleđuje klasu Klub, i dodati metodu:
- odbrambeniAs() -> vraća ime igrača koji ima najvise poena, ali je igrao manje od 3 godine.
vrednostTima() -> za kosarkaski tim racunamo da igrac vredi 50 za svaki postignut poen, za fudbalski tim
racunamo da igrac vredi po 1000 za svaki postignut gol, dok za odbojkaski tim svaki igrac vredi 100 po
poenu. Vrednost tima predstavlja sumu cena svih njegovih igraca (edited)
 */
public class Main {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Pera",5,100);
        Igrac i2 = new Igrac("Mika",2,1110);
        Igrac i3 = new Igrac("Laza",7,120);
        Igrac i4 = new Igrac("Maza",1,1111);

        ArrayList<Igrac> listaIgraca = new ArrayList<>();
        listaIgraca.add(i1);
        listaIgraca.add(i2);
        listaIgraca.add(i3);
        listaIgraca.add(i4);

        KosarkaskiKlub k = new KosarkaskiKlub("Mega","Beograd",listaIgraca);
        System.out.println(k.najiskusnijiIgrac());
        System.out.println(k.ukupnoPoena());
        System.out.println(k.vrednostTima());
        System.out.println(k.sampionTima());

        FudbalskiKlub f = new FudbalskiKlub("Radnicki","Kragujevac", listaIgraca);
        System.out.println(f.najboljiStrelac());

        OdbojkaskiKlub o = new OdbojkaskiKlub("Vojvodina", "Novi Sad", listaIgraca);
        System.out.println(o.odbrambeniAs());
    }
}
