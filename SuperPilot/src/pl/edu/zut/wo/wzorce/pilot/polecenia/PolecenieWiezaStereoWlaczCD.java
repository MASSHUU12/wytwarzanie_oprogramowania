package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class PolecenieWiezaStereoWlaczCD implements Polecenie{
    WieżaStereo wieza;

    public PolecenieWiezaStereoWlaczCD(
            WieżaStereo wieza
    ) {
        super();
        this.wieza = wieza;
    }

    @Override
    public void wykonaj() {
        wieza.włącz();
    }

    @Override
    public void wycofaj() {
        wieza.wyłącz();
    }
}
