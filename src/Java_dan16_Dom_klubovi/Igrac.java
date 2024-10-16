package Java_dan16_Dom_klubovi;

public class Igrac {
    private String ime;
    private int godI;
    private int brojP;

    public Igrac(String ime, int godI, int brojP) {
        this.ime = ime;
        this.godI = godI;
        this.brojP = brojP;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodI() {
        return godI;
    }

    public void setGodI(int godI) {
        this.godI = godI;
    }

    public int getBrojP() {
        return brojP;
    }

    public void setBrojP(int brojP) {
        this.brojP = brojP;
    }

    public String toString() {
        return "Igrac{" + "ime='" + ime + '\'' + ", godI=" + godI + ", brojP=" + brojP + '}';
    }
}
