package pl.edu.zut.wo.wzorce.pilot;

import pl.edu.zut.wo.wzorce.pilot.polecenia.*;
import pl.edu.zut.wo.wzorce.pilot.sterowniki.*;

public class SuperPilotTestMakro {
    public static void main(String[] args) {
        SuperPilot superPilot = new SuperPilot();

        Światło salonŚwiatło = new Światło("Salon");
        TV telewizor = new TV("Salon");
        WieżaStereo wieza = new WieżaStereo("Salon");
        Jacuzzi jacuzzi = new Jacuzzi();

        Polecenie przyciemnijSwiatlo = new PolecenieWylaczSwiatlo(salonŚwiatło);
        Polecenie wlaczTelewizor = new PolecenieWlaczTV(telewizor);
        Polecenie wlaczDVD = new PolecenieUstawWieżaStereo(wieza, "DVD");
        Polecenie wlaczJacuzzi = new PolecenieWlaczJacuzzi(jacuzzi);

        Polecenie[] trybImpreza = {przyciemnijSwiatlo, wlaczTelewizor, wlaczDVD, wlaczJacuzzi};
        MakroPolecenie makroImpreza = new MakroPolecenie(trybImpreza);

        superPilot.ustawPolecenie(0, makroImpreza, new BrakPolecenia());

        System.out.println("Tryb Impreza:");
        superPilot.wciśniętoPrzyciskWłącz(0);

        // Test wycofania trybu imprezy
        System.out.println("\nWycofanie Trybu Impreza:");
        superPilot.wciśniętoPrzyciskWycofaj();
    }
}
