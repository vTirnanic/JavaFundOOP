package Java_dan13_Dom_Banka;
/*
Domaci:
Prepraviti prethodni domaci tako sto cete dodati odgovarajuce modifikatore vidljivosti i primeniti enkapsulaciju.
Domaci predajete do sutrasnjeg predavanja
*/
public class Main {
    public static void main(String[] args) {

    BankovniRacun br = new BankovniRacun(54689,"Perica Peric",8000);
        System.out.println(br);
        br.uplata();
        br.isplata();
        br.isplata();
        System.out.println(br);
    }
}

