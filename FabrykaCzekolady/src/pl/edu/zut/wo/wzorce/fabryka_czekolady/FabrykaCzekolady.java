package pl.edu.zut.wo.wzorce.fabryka_czekolady;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager.Eager;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny.Klasyczny;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.synchro.Synchro;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.CzekoladowyKocioł;

public class FabrykaCzekolady {

	public static void main(String... params) {
		CzekoladowyKocioł kocioł = new CzekoladowyKocioł();
		kocioł.napełniaj();
		kocioł.gotuj();
		kocioł.opróżniaj();

		Klasyczny klasyczny = Klasyczny.pobierzInstancję();
		klasyczny.napełniaj();
		klasyczny.gotuj();
		klasyczny.opróżniaj();

		Synchro synchro = Synchro.pobierzInstancję();
		synchro.napełniaj();
		synchro.gotuj();
		synchro.opróżniaj();

		Eager eager = Eager.pobierzInstancję();
		eager.napełniaj();
		eager.gotuj();
		eager.opróżniaj();

		// Użycie pełnej nazwy kwalifikowanej dla Singletona z pakietu double_lock
		pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock.Singleton doubleLock =
				pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.double_lock.Singleton.pobierzInstancję();
		doubleLock.napełniaj();
		doubleLock.gotuj();
		doubleLock.opróżniaj();

		// Użycie pełnej nazwy kwalifikowanej dla Singletona z pakietu jbloch
		pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.Singleton.INSTANCE.napełniaj();
		pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.Singleton.INSTANCE.gotuj();
		pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.jbloch.Singleton.INSTANCE.opróżniaj();
	}
}
