package Java_dan15_Dom_AutoriKnjiga;

import java.util.ArrayList;

public class Romanopisac extends Pisac {

    public Romanopisac(String ime, int godRodj, ArrayList<Knjiga> lKnjiga) {
        super(ime, godRodj, lKnjiga);
    }

    public void dugometrazniRoman() {
        for (Knjiga k : getlKnjiga()) {
            if (k.getBrojStr() > 500) {
                System.out.println(k + " je dugometrazni roman.");
            }
        }
    }
}
