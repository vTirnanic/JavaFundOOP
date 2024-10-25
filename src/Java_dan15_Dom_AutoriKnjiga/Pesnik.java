package Java_dan15_Dom_AutoriKnjiga;

import java.util.ArrayList;

public class Pesnik extends Pisac {

    public Pesnik(String ime, int godRodj, ArrayList<Knjiga> lKnjiga) {
        super(ime, godRodj, lKnjiga);
    }

    public int brojZbirki() {
        int brojac = 0;
        for (Knjiga k : getlKnjiga()) {
            if (k.getBrojStr() < 100) {
                brojac++;
            }
        }
        return brojac;
    }
}
