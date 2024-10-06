package pl.edu.zut.wo.wzorce.pogodynka.wyswietl;

import pl.edu.zut.wo.wzorce.pogodynka.Obserwator;

public class HeatIndexDisplay implements Obserwator, WyswietlElement {

    private float heatIndex;

    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.heatIndex = computeHeatIndex(temperatura, wilgotnosc);
        wyswietl();
    }

    public void wyswietl() {
        System.out.println("Heat index: " + heatIndex);
    }

    private float computeHeatIndex(float t, float rh) {
        float t2 = t * t;
        float t3 = t2 * t;
        float rh2 = rh * rh;
        float rh3 = rh2 * rh;

        return (float) (
                16.923 + (0.185212 * t) + (5.37941 * rh)
                        - (0.100254 * t * rh) + (0.00941695 * t2)
                        + (0.00728898 * rh2) + (0.000345372 * (t2 * rh))
                        - (0.000814971 * (t * rh2)) + (0.0000102102 * (t2 * rh2))
                        - (0.000038646 * t3) + (0.0000291583 * rh3)
                        + (0.00000142721 * (t3 * rh)) + (0.000000197483 * (t * rh3))
                        - (0.0000000218429 * (t3 * rh2))
                        + (0.000000000843296 * (t2 * rh3))
                        - (0.00000000000491975 * (t3 * rh3))
        );
    }
}