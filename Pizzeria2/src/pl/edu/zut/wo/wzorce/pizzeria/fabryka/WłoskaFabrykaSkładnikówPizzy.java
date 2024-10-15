package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.składniki.*;

public class WłoskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {
	public Ciasto utwórzCiasto() {
		return new CienkieChrupkieCiasto();
	}

	public Sos utwórzSos() {
		return new SosMarinara();
	}


	public Ser[] utwórzSer() {
		Ser[] sery = { new SerMozzarella()};
		return sery;
	}

	public Warzywa[] utwórzWarzywa() {
		Warzywa warzywa[] = { new Czosnek(), new Cebula(), new Pieczarki(), new CzerwonaPapryka() };
		return warzywa;
	}

	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	public Małże utwórzMałże() {
		return new ŚwieżeMałże();
	}
}