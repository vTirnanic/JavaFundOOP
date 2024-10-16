package Java_dan16_Dom_klubovi;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {
    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaI) {
        super(naziv, grad, listaI);
    }

    public String odbrambeniAs() {

        ArrayList<Igrac> listaMladih = new ArrayList<>();

        for (Igrac i : getListaI()) {
            if (i.getGodI() < 3) {
                listaMladih.add(i);
            }
        }

        if (listaMladih.isEmpty()) {
            return "U ovom klubu ne postoji odbrambeni as.";
        }

        Igrac oAS = listaMladih.get(0);
        for (Igrac i : listaMladih) {
            if (i.getBrojP() > oAS.getBrojP()) {
                oAS = i;
            }
        }
        return oAS.getIme();
    }

    @Override
    public double vrednostTima() {
        double vrT = 0;
        for (Igrac i : getListaI()) {
            vrT += i.getBrojP() * 100;
        }
        return vrT;
    }
}
