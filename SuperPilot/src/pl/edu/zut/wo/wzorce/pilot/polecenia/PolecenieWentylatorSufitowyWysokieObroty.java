package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class PolecenieWentylatorSufitowyWysokieObroty implements Polecenie {
    WentylatorSufitowy wentylator;

    public PolecenieWentylatorSufitowyWysokieObroty(
            WentylatorSufitowy wentylator
    ) {
        super();
        this.wentylator = wentylator;
    }

    @Override
    public void wykonaj() {
        wentylator.szybko();
    }

    @Override
    public void wycofaj() {
        wentylator.off();
    }
}
