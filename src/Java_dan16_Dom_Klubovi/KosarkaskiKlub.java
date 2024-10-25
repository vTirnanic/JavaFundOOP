package Java_dan16_Dom_Klubovi;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub {

    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaI) {
        super(naziv, grad, listaI);
    }

    public String sampionTima() {
        String samp = "U ovom timu nema sampiona.";
        for (Igrac i : getListaI()) {
            if (i.getBrojP() > 1000) {
                samp = i.getIme();
            }
        }
        return samp;
    }

    @Override
    public double vrednostTima() {
        double vrT = 0;
        for (Igrac i : getListaI()) {
            vrT += i.getBrojP() * 50;
        }
        return vrT;
    }
}
