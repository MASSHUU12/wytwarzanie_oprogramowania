package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class PolecenieUstawWieżaStereo implements Polecenie {
    private WieżaStereo wieza;
    private String tryb;

    public PolecenieUstawWieżaStereo(WieżaStereo wieza, String tryb) {
        this.wieza = wieza;
        this.tryb = tryb;
    }

    @Override
    public void wykonaj() {
        wieza.włącz();
        wieza.ustawTryb(tryb);
    }

    @Override
    public void wycofaj() {
        wieza.wyłącz();
    }
}
