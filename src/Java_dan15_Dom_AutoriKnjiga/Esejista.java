package Java_dan15_Dom_AutoriKnjiga;

import java.util.ArrayList;

public class Esejista extends Pisac {

    public Esejista(String ime, int godRodj, ArrayList<Knjiga> lKnjiga) {
        super(ime, godRodj, lKnjiga);
    }

    public int kratkiEseji() {
        int brojac = 0;
        for (Knjiga k : getlKnjiga()) {
            if (k.getBrojStr() < 50) {
                brojac++;
            }
        }
        return brojac;
    }
}
