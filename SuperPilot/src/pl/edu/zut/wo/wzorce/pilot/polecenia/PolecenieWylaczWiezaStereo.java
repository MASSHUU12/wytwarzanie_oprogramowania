package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class PolecenieWylaczWiezaStereo implements Polecenie {
    private WieżaStereo wieza;

    public PolecenieWylaczWiezaStereo(WieżaStereo wieza) {
        this.wieza = wieza;
    }

    @Override
    public void wykonaj() {
        wieza.wyłącz();
    }

    @Override
    public void wycofaj() {
        wieza.włącz();
        wieza.ustawTryb("CD");
    }
}
