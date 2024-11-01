package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public enum Singleton {
    INSTANCE;

    private CzekoladowyKocioł kocioł = new CzekoladowyKocioł();

    public void napełniaj() {
        kocioł.napełniaj();
    }

    public void opróżniaj() {
        kocioł.opróżniaj();
    }

    public void gotuj() {
        kocioł.gotuj();
    }

    public boolean jestPusty() {
        return kocioł.jestPusty();
    }

    public boolean jestUgotowany() {
        return kocioł.jestUgotowany();
    }
}
