package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Jacuzzi;

public class PolecenieWlaczJacuzzi implements Polecenie {
    private Jacuzzi jacuzzi;

    public PolecenieWlaczJacuzzi(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @Override
    public void wykonaj() {
        jacuzzi.włącz();
        jacuzzi.ustawTemperaturę(40);
        jacuzzi.włączDysze();
        jacuzzi.cyrkulacja();
    }

    @Override
    public void wycofaj() {
        jacuzzi.wyłączDysze();
        jacuzzi.wyłącz();
    }
}
