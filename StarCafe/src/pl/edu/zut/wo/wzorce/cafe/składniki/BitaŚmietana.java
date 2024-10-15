package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;


public class BitaŚmietana extends SkładnikiDekorator {
    Napój napój;

    public BitaŚmietana(Napój napój) {
        this.napój = napój;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis();
    }

    public double koszt() {
        return 0.1 + napój.koszt();
    }
}
