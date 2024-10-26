package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class Synchro extends CzekoladowyKocioł {
	private static Synchro unikalnaInstancja;

	// tutaj umieść inne użyteczne zmienne obiektowe
	private Synchro() {
		super();
	}

	public static synchronized Synchro pobierzInstancję() {
		if (unikalnaInstancja == null) {
			unikalnaInstancja = new Synchro();
		}
		return unikalnaInstancja;
	}
	// tutaj umieść inne użyteczne metody
	public synchronized void napełniaj() {
		this.napełniaj();
	}

	public synchronized void opróżniaj() {
		this.opróżniaj();
	}

	public synchronized void gotuj() {
		this.gotuj();
	}

	public synchronized boolean jestPusty() {
		return this.jestPusty();
	}

	public synchronized boolean jestUgotowany() {
		return this.jestUgotowany();
	}
}