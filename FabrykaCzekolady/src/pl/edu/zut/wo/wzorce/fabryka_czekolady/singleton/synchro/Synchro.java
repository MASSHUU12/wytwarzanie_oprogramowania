package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class Synchro extends CzekoladowyKocioł {
	private static Synchro unikalnaInstancja;

	private Synchro() {
		super();
	}

	public static synchronized Synchro pobierzInstancję() {
		if (unikalnaInstancja == null) {
			unikalnaInstancja = new Synchro();
		}
		return unikalnaInstancja;
	}


	@Override
	public synchronized void napełniaj() {
		super.napełniaj();
	}

	@Override
	public synchronized void opróżniaj() {
		super.opróżniaj();
	}

	@Override
	public synchronized void gotuj() {
		super.gotuj();
	}

	@Override
	public synchronized boolean jestPusty() {
		return super.jestPusty();
	}

	@Override
	public synchronized boolean jestUgotowany() {
		return super.jestUgotowany();
	}
}
