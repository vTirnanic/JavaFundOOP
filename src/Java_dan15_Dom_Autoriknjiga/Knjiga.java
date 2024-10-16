package Java_dan15_Dom_Autoriknjiga;

public class Knjiga {
    private String naslov;
    private int brojStr;
    private int godIzd;

    public Knjiga(String naslov, int brojStr, int godIzd) {
        this.naslov = naslov;
        this.brojStr = brojStr;
        this.godIzd = godIzd;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStr() {
        return brojStr;
    }

    public void setBrojStr(int brojStr) {
        this.brojStr = brojStr;
    }

    public int getGodIzd() {
        return godIzd;
    }

    public void setGodIzd(int godIzd) {
        this.godIzd = godIzd;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "naslov='" + naslov + '\'' + ", brojStr=" + brojStr + ", godIzd=" + godIzd + '}';
    }
}
