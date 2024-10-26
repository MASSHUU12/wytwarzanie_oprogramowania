package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Światło;

public class PolecenieWylaczSwiatlo implements Polecenie {
    Światło swiatlo;

    public PolecenieWylaczSwiatlo(Światło swiatlo) {
        super();
        this.swiatlo = swiatlo;
    }

    public void wykonaj() {
        swiatlo.wyłącz();
    }

    @Override
    public void wycofaj() {
        swiatlo.włącz();
    }
}
