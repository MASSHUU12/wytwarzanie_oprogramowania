package pl.edu.zut.wo.wzorce.symulator;


public class GumowaKaczka extends Kaczka {
	public GumowaKaczka() {
		latanieInt = new NieLatam();
		kwakanieInt = new Piszcz();
	}

	public void wyswietl(){
		System.out.println("Wygląda jak gumowa kaczka");
	}
}