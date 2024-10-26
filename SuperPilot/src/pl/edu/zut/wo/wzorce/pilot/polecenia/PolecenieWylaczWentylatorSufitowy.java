package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class PolecenieWylaczWentylatorSufitowy implements Polecenie {
    WentylatorSufitowy wentylator;

    public PolecenieWylaczWentylatorSufitowy(
            WentylatorSufitowy wentylator
    ) {
        super();
        this.wentylator = wentylator;
    }

    @Override
    public void wykonaj() {
        wentylator.off();
    }

    @Override
    public void wycofaj() {
        wentylator.wolno();
    }
}
