package Java_dan14_Dom_Valute;

public class Evro extends Valuta{

    public Evro(double kurs) {
        super("Evro", "EUR", kurs);
    }

    public void postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
    }

}
