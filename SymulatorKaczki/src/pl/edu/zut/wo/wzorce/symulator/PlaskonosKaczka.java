package pl.edu.zut.wo.wzorce.symulator;

public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka() {
        latanieInt = new LatamBoMamSkrzydla();
        kwakanieInt = new Kwacz();
    }

    public void wyswietl() {
        System.out.println("Wyglądam jak płaskonos.");
    }
}
