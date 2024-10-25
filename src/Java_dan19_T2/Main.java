package Java_dan19_T2;

import java.util.ArrayList;
/*
Napraviti klasu Planina
atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka
max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
Napraviti klasu Amater koji nasledjuje klasu Planinar.
Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine koje su vece
od njegovog maxUspon-a.
Za sve klase je potrebno deklarisati dati konstruktor, get,set i toString.
 */
public class Main {
    public static void main(String[] args) {

        Planina p1 = new Planina("Jelica",950,false);
        Planina p2 = new Planina("Sarplanina",2200,true);
        Planina p3 = new Planina("Kopaonik",2300,false);
        Planina p4 = new Planina("Cer",1100,true);
        Planina p5 = new Planina("Povlen",1600,true);

        ArrayList<Planina> listaPl = new ArrayList<>();
        listaPl.add(p1);
        listaPl.add(p2);
        listaPl.add(p3);
        listaPl.add(p4);

        Planinar am = new Amater(listaPl,1500);
        Planinar re = new Rekreativac(listaPl,1300);

        //am.dodaj(p5);
        //re.dodaj(p5);

        //System.out.println(listaPl);

        //System.out.println(pl.opasne());

        //am.izbaci();
        //re.izbaci();

        //System.out.println(listaPl);

        //System.out.println(re.najveca());

        Planinar pro = new Pro(listaPl,2000);

        pro.dodaj(p5);
        System.out.println(listaPl);

        pro.izbaci();
        System.out.println(listaPl);
    }
}
