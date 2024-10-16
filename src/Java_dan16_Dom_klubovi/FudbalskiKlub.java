package Java_dan16_Dom_klubovi;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaI) {
        super(naziv, grad, listaI);
    }

    public String najboljiStrelac() {
        Igrac najS = getListaI().get(0);
        for (Igrac i : getListaI()) {
            if (i.getBrojP() > najS.getBrojP()) {
                najS = i;
            }
        }
        return najS.getIme();
    }

    @Override
    public double vrednostTima() {
        double vrT = 0;
        for (Igrac i : getListaI()) {
            vrT += i.getBrojP() * 1000;
        }
        return vrT;
    }
}
