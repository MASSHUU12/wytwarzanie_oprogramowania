package pl.edu.zut.wo.wzorce.fabryka_czekolady;

import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.eager.Eager;
import pl.edu.zut.wo.wzorce.fabryka_czekolady.singleton.klasyczny.Klasyczny;

public class FabrykaCzekoladyWątki {

    public static void main(String... params) {
        Thread wątek1 = new Thread("Wątek 1") {
            public void run() {
                test(getName());
            }
        };
        Thread wątek2 = new Thread("Wątek 2") {
            public void run() {
                test(getName());
            }
        };
        wątek1.start();
        wątek2.start();
    }

    private static void test(String name) {
        System.out.println("Uruchomione przez: " + name);
        CzekoladowyKocioł kocioł = new CzekoladowyKocioł();
        kocioł.napełniaj();
        kocioł.gotuj();
        kocioł.opróżniaj();

        Klasyczny klasyczny = Klasyczny.pobierzInstancję();
        klasyczny.napełniaj();
        klasyczny.gotuj();
        klasyczny.opróżniaj();

//		Synchro synchro = Synchro.pobierzInstancję();
//		synchro.napełniaj();
//		synchro.gotuj();
//		synchro.opróżniaj();

        Eager eager = Eager.pobierzInstancję();
        eager.napełniaj();
        eager.gotuj();
        eager.opróżniaj();
    }
}
