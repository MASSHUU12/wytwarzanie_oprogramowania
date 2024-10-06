package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.PrognozaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.StatystykaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.WarunkiBiezaceWyswietlanie;

public class DanePogodowe {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    private PrognozaWyswietlanie prognozaWyswietl = new PrognozaWyswietlanie();
    private WarunkiBiezaceWyswietlanie warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietlanie();
    private StatystykaWyswietlanie statystykaWyswietl = new StatystykaWyswietlanie();

    public void odczytyZmiana() {
        float temp = pobierzTemperaturę();
        float wilgotnosc = pobierzWilgotnosc();
        float cisnienie = pobierzCisnienie();
        warunkiBiezaceWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
        statystykaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
        prognozaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
    }

    private float pobierzTemperaturę() {
        return temperatura;
    }

    private float pobierzWilgotnosc() {
        return wilgotnosc;
    }

    private float pobierzCisnienie() {
        return cisnienie;
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

}
