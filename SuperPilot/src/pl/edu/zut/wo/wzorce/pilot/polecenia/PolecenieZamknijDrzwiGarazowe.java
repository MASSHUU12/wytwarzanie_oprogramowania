package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarażu;

public class PolecenieZamknijDrzwiGarazowe implements Polecenie {
    DrzwiGarażu drzwi;

    public PolecenieZamknijDrzwiGarazowe(
            DrzwiGarażu drzwi
    ) {
        super();
        this.drzwi = drzwi;
    }

    @Override
    public void wykonaj() {
        drzwi.opuść();
    }

    @Override
    public void wycofaj() {
        drzwi.podnieś();
    }
}
