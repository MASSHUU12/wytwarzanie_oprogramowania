package pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class Singleton extends CzekoladowyKocioł {
	private volatile static Singleton unikalnaInstancja;
	private Singleton() {
		super();
	}
	public static Singleton pobierzInstancję() {
		if (unikalnaInstancja == null) {
			synchronized (Singleton.class) {
				if (unikalnaInstancja == null) {
					unikalnaInstancja = new Singleton();
				}
			}
		}
		return unikalnaInstancja;
	}
}
