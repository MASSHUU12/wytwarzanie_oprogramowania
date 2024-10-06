package pl.edu.zut.wo.wzorce.symulator;

public class Kaczka {
    protected LatanieInterfejs latanieInt;
    protected KwakanieInterfejs kwakanieInt;

    void wykonajKwacz() {
    	kwakanieInt.kwacz();
    }
    void plywaj() {
    	System.out.println("Pływam jak kaczka.");
    }
    void wyswietl() {
    	System.out.println("Wyglądam jak kaczka.");
    }
    void wykonajLec() {
        latanieInt.lec();
    }
}
