package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager;


import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class Eager extends CzekoladowyKocioł {
	private static Eager unikalnaInstancja = new Eager();

	// tutaj umieść inne użyteczne zmienne obiektowe
	private Eager() {
		super();
	}

	public static synchronized Eager pobierzInstancję() {
		return unikalnaInstancja;
	}
	// tutaj umieść inne użyteczne metody
}