package Java_dan15_Dom_AutoriKnjiga;

import java.util.ArrayList;

public class Pisac {
    private String ime;
    private int godRodj;
    private ArrayList<Knjiga> lKnjiga;

    public Pisac(String ime, int godRodj, ArrayList<Knjiga> lKnjiga) {
        this.ime = ime;
        this.godRodj = godRodj;
        this.lKnjiga = lKnjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodRodj() {
        return godRodj;
    }

    public void setGodRodj(int godRodj) {
        this.godRodj = godRodj;
    }

    public ArrayList<Knjiga> getlKnjiga() {
        return lKnjiga;
    }

    public void setlKnjiga(ArrayList<Knjiga> lKnjiga) {
        this.lKnjiga = lKnjiga;
    }

    public String najpoznatijaKnjiga() {
        Knjiga najPozK = getlKnjiga().get(0);
        for (Knjiga k : getlKnjiga()) {
            if (k.getBrojStr() > najPozK.getBrojStr()) {
                najPozK = k;
            }
        }
        return najPozK.getNaslov();
    }

    public int vremePisanja() {

        Knjiga prvaKnjiga = getlKnjiga().get(0);
        for (Knjiga k : getlKnjiga()) {
            if (k.getGodIzd() < prvaKnjiga.getGodIzd()) {
                prvaKnjiga = k;
            }
        }

        Knjiga poslKnjiga = getlKnjiga().get(0);
        for (Knjiga k : getlKnjiga()) {
            if (k.getGodIzd() > poslKnjiga.getGodIzd()) {
                poslKnjiga = k;
            }
        }
        return poslKnjiga.getGodIzd() - prvaKnjiga.getGodIzd();
    }

    public String toString() {
        return "Pisac{" + "ime='" + ime + '\'' + ", godRodj=" + godRodj + ", lKnjiga=" + lKnjiga + '}';
    }
}
