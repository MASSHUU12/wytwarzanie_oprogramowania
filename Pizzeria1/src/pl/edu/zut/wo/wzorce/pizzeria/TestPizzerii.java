package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca.AmerykańskaPizzeria;
import pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca.WłoskaPizzeria;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class TestPizzerii {

    public static void main(String[] args) {
        AmerykańskaPizzeria amerykańska = new AmerykańskaPizzeria();
        Pizza pizza = amerykańska.zamówPizza("serowa");
        System.out.println(
                amerykańska.getClass().getSimpleName()
                        + " wyprodukowała "
                        + pizza.getClass().getSimpleName()
        );

        WłoskaPizzeria włoska = new WłoskaPizzeria();
        pizza = włoska.zamówPizza("pepperoni");
        System.out.println(
                włoska.getClass().getSimpleName()
                        + " wyprodukowała "
                        + pizza.getClass().getSimpleName()
        );
    }
}
