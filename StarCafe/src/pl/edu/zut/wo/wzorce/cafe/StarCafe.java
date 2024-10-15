package pl.edu.zut.wo.wzorce.cafe;

import pl.edu.zut.wo.wzorce.cafe.napoje.MocnoPalona;
import pl.edu.zut.wo.wzorce.cafe.napoje.Napój;
import pl.edu.zut.wo.wzorce.cafe.składniki.BitaŚmietana;
import pl.edu.zut.wo.wzorce.cafe.składniki.Czekolada;

public class StarCafe {
	public static void main(String... params) {
		Napój napój = new Czekolada(new BitaŚmietana(new MocnoPalona()));
		System.out.println(napój.pobierzOpis() + " " + napój.koszt() + "zł");
	}
}
