package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarażu;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.Światło;

public class SuperPilotProgramuj {

    public static void main(String[] args) {
        SuperPilot superPilot = new SuperPilot();

        DrzwiGarażu drzwiGarażu = new DrzwiGarażu("Garaż");
        superPilot.ustawPolecenie(
                0,
                new PolecenieOtworzDrzwiGarazowe(drzwiGarażu),
                new PolecenieZamknijDrzwiGarazowe(drzwiGarażu)
        );

        Światło salonŚwiatło = new Światło("Salon");
        superPilot.ustawPolecenie(
                1,
                new PolecenieWłączŚwiatło(salonŚwiatło),
                new PolecenieWylaczSwiatlo(salonŚwiatło)
        );

        Światło kuchniaŚwiatło = new Światło("Kuchnia");

        WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Salon");

        System.out.println(superPilot);

        superPilot.wciśniętoPrzyciskWłącz(0);
        superPilot.wciśniętoPrzyciskWycofaj();
        superPilot.wciśniętoPrzyciskWyłącz(0);
        superPilot.wciśniętoPrzyciskWłącz(1);
        superPilot.wciśniętoPrzyciskWyłącz(1);
        superPilot.wciśniętoPrzyciskWłącz(2);
        superPilot.wciśniętoPrzyciskWyłącz(2);
        superPilot.wciśniętoPrzyciskWłącz(3);
        superPilot.wciśniętoPrzyciskWyłącz(3);
        superPilot.wciśniętoPrzyciskWłącz(4);
        superPilot.wciśniętoPrzyciskWyłącz(4);
    }
}
