public class App {
    public static void main(String[] args) throws Exception {

        tulostaOtsikko();
        laskePintaAla(5,3);
       

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
