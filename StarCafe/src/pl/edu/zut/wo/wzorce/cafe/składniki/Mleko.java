package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;

public class Mleko extends SkładnikiDekorator {
    Napój napój;

    public Mleko(Napój napój) {
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
