package Java_dan16_Dom_klubovi;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaI;

    public Klub(String naziv, String grad, ArrayList<Igrac> listaI) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaI = listaI;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaI() {
        return listaI;
    }

    public void setListaI(ArrayList<Igrac> listaI) {
        this.listaI = listaI;
    }

    public Igrac najiskusnijiIgrac() {
        Igrac nIgrac = getListaI().get(0);
        for (Igrac i : getListaI()) {
            if (i.getGodI() > nIgrac.getGodI()) {
                nIgrac = i;
            }
        }
        return nIgrac;
    }

    public int ukupnoPoena() {
        int ukP = 0;
        for (Igrac i : getListaI()) {
            ukP += i.getBrojP();
        }
        return ukP;
    }

    public abstract double vrednostTima();

    public String toString() {
        return "Klub{" + "naziv='" + naziv + '\'' + ", grad='" + grad + '\'' + ", listaI=" + listaI + '}';
    }
}
