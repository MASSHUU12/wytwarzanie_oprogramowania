package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class PolecenieWlaczTV implements Polecenie {
    private TV tv;

    public PolecenieWlaczTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void wykonaj() {
        tv.włącz();
        tv.ustawDVD();
    }

    @Override
    public void wycofaj() {
        tv.wyłącz();
    }
}
