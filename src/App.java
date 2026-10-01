import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int pituus = 0;
        int leveys = 0;

        tulostaOtsikko();

        System.out.println("Anna pituus");
        pituus = Integer.parseInt(in.nextLine());

        System.out.println("Anna leveys");
        leveys = Integer.parseInt(in.nextLine());

        laskePintaAla(pituus, leveys);

        //laskePintaAla(5,3);

    }  // mainin loppu


    public static void tulostaOtsikko() {
        System.out.println("*** Metodi-esimerkkejä ***");
    }  // tulostaOtsikko-metodin lopetus

    public static void laskePintaAla(int pit, int lev) {
        int pintaAla = 0;
        pintaAla = pit * lev;
        System.out.println("Pinta-ala on " + pintaAla);
    }
    

}
