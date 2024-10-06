package pl.edu.zut.wo.wzorce.pogodynka;

public interface Obserwator {
    void aktualizacja(float temperatura, float wilgotnosc, float cisnienie);
}
