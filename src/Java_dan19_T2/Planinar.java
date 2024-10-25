package Java_dan19_T2;

import java.util.ArrayList;
/*
Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka
max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
 */
public abstract class Planinar {
    private ArrayList<Planina> listaPl;
    private int maxU;

    public Planinar(ArrayList<Planina> listaPl, int maxU) {
        this.listaPl = listaPl;
        this.maxU = maxU;
    }

    public ArrayList<Planina> getListaPl() {
        return listaPl;
    }

    public void setListaPl(ArrayList<Planina> listaPl) {
        this.listaPl = listaPl;
    }

    public int getMaxU() {
        return maxU;
    }

    public void setMaxU(int maxU) {
        this.maxU = maxU;
    }

    public void dodaj(Planina p) {
        if (p.getVisina() <= getMaxU()) {
            listaPl.add(p);
        }
    }

    public ArrayList<Planina> opasne() {
        ArrayList<Planina> opasnePlanine = new ArrayList<>();
        for (Planina p : getListaPl()) {
            if (p.isOpasnost()) {
                opasnePlanine.add(p);
            }
        }
        return opasnePlanine;
    }

    public abstract void izbaci();

    public Planina najveca() {
        Planina najV = getListaPl().get(0);
        for (Planina p : getListaPl()) {
            if (p.getVisina() > najV.getVisina()) {
                najV = p;
            }
        }
        return najV;
    }

    public String toString() {
        return "Planinar{" + "listaPl=" + listaPl + ", maxU=" + maxU + '}';
    }
}
