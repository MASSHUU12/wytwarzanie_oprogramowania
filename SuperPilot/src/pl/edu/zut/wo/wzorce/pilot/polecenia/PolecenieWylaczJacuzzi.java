package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Jacuzzi;

public class PolecenieWylaczJacuzzi implements Polecenie {
    private Jacuzzi jacuzzi;

    public PolecenieWylaczJacuzzi(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @Override
    public void wykonaj() {
        jacuzzi.wyłączDysze();
        jacuzzi.wyłącz();
    }

    @Override
    public void wycofaj() {
        jacuzzi.włącz();
        jacuzzi.ustawTemperaturę(40);
        jacuzzi.włączDysze();
        jacuzzi.cyrkulacja();
    }
}
