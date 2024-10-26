package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class PolecenieWiezaStereoWylaczCD implements Polecenie {
    WieżaStereo wieza;

    public PolecenieWiezaStereoWylaczCD(
            WieżaStereo wieza
    ) {
        super();
        this.wieza = wieza;
    }

    @Override
    public void wykonaj() {
        wieza.wyłącz();
    }

    @Override
    public void wycofaj() {
        wieza.włącz();
    }
}
