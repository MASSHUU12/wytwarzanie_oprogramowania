package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

public class PrognozaWyswietlanie {

    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        wyswietl();
    }

    public void wyswietl() {
        System.out.println("Prognoza " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotnosc");
    }

}