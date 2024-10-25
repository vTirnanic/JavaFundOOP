package Java_dan14_Dom_Valute;

public class Dolar extends Valuta {

    public Dolar(double kurs) {
        super("Dolar", "USD", kurs);
    }

    public void postaviKursNovi(double noviKurs) {
        setKurs(noviKurs);
    }
}
