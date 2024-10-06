package pl.edu.zut.wo.wzorce.symulator;

public class MiniSymulatorKaczki {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wyswietl();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        Kaczka wabik = new WabikKaczka();
        wabik.wyswietl();
        wabik.wykonajKwacz();
        wabik.wykonajLec();

        Kaczka gumowa = new GumowaKaczka();
        gumowa.wyswietl();
        gumowa.wykonajKwacz();
        gumowa.wykonajLec();

        Kaczka plaskonos = new PlaskonosKaczka();
        plaskonos.wyswietl();
        plaskonos.wykonajKwacz();
        plaskonos.wykonajLec();

        ModelKaczki modelk = new ModelKaczki();
        modelk.wyswietl();
        modelk.wykonajKwacz();
        modelk.wykonajLec();
        modelk.ustawLatanie(new NieLatam());
        modelk.wykonajLec();
    }
}
