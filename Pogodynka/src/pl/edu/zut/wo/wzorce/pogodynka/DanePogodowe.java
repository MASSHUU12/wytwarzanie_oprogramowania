package pl.edu.zut.wo.wzorce.pogodynka;

import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.HeatIndexDisplay;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.PrognozaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.StatystykaWyswietlanie;
import pl.edu.zut.wo.wzorce.pogodynka.wyswietl.WarunkiBiezaceWyswietlanie;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
    private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        zarejestrujObserwatora(new PrognozaWyswietlanie());
        zarejestrujObserwatora(new StatystykaWyswietlanie());
        zarejestrujObserwatora(new WarunkiBiezaceWyswietlanie());
        zarejestrujObserwatora(new HeatIndexDisplay());
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        powiadomObserwatorow();
    }

    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    public void usunObserwatora(Obserwator o) {
        obserwatorzy.remove(o);
    }

    public void powiadomObserwatorow() {
        for (Obserwator o : obserwatorzy) {
            o.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }
}
