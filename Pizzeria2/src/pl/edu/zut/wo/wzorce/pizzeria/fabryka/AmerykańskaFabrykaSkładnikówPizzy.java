package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.składniki.*;

public class AmerykańskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {
    public Ciasto utwórzCiasto() {
        return new CienkieChrupkieCiasto();
    }

    public Sos utwórzSos() {
        return new SosZPomidorówŚliwkowych();
    }

    public Ser[] utwórzSer() {
        Ser sery[] = {new SerParmezan(), new SerMozzarella()};
        return sery;
    }


    public Warzywa[] utwórzWarzywa() {
        Warzywa warzywa[] = {new Bakłażany(), new Szpinak(), new CzarneOliwki(), new Oregano()};
        return warzywa;
    }

    public Pepperoni utwórzPepperoni() {
        return new PlastryPepperoni();
    }

    public Małże utwórzMałże() {
        return new ŚwieżeMałże();
    }
}