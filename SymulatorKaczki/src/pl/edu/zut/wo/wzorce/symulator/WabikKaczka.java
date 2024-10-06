package pl.edu.zut.wo.wzorce.symulator;

public class WabikKaczka extends Kaczka {

    public WabikKaczka() {
        latanieInt = new NieLatam();
        kwakanieInt = new Piszcz();
    }

    public void wyswietl() {
        System.out.println("Wyglądam jak wabik.");
    }
}
