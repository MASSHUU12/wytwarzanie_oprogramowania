package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

import pl.edu.zut.wo.wzorce.pogodynka.Obserwator;

public class WarunkiBiezaceWyswietlanie implements Obserwator, WyswietlElement {

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
        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotnosc");
    }
}