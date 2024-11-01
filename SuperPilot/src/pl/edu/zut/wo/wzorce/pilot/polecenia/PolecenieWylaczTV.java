package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class PolecenieWylaczTV implements Polecenie {
    private TV tv;

    public PolecenieWylaczTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void wykonaj() {
        tv.wyłącz();
    }

    @Override
    public void wycofaj() {
        tv.włącz();
        tv.ustawDVD();
    }
}
