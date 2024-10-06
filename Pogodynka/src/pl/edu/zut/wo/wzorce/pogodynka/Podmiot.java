package pl.edu.zut.wo.wzorce.pogodynka;

public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator o);
    public void usunObserwatora(Obserwator o);
    public void powiadomObserwatora(Obserwator o);
}
