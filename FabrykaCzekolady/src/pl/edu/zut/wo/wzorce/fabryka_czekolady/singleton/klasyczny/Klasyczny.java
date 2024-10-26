package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class Klasyczny extends CzekoladowyKocioł {
	private static Klasyczny unikalnaInstancja;

	// tutaj umieść inne użyteczne zmienne obiektowe
	private Klasyczny() {
		super();
	}

	public static Klasyczny pobierzInstancję() {
		if (unikalnaInstancja == null) {
			unikalnaInstancja = new Klasyczny();
		}
		return unikalnaInstancja;
	}
	// tutaj umieść inne użyteczne metody
}