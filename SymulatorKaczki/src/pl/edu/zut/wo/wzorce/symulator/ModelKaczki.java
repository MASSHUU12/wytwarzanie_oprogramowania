package pl.edu.zut.wo.wzorce.symulator;

public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        latanieInt = new LotZNapedemRakietowym();
        kwakanieInt = new NieKwacz();
    }

    public void ustawLatanie(LatanieInterfejs latanie) {
        latanieInt = latanie;
    }

    public void wyswietl() {
        System.out.println("Wygląda. jak rakietowa kaczka.");
    }
}
