package pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.*;

public class AmerykańskaPizzeria extends Pizzeria{
    public Pizza utwórzPizza(String type){
        Pizza pizza = null;
        if (type.equals("serowa")) {
            pizza = new AmerykańskaSerowaPizza();
        } else if (type.equals("owocemorza")) {
            pizza = new AmerykańskaOwoceMorzaPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new AmerykańskaPepperoniPizza();
        } else if (type.equals("wegetariańska")) {
            pizza = new AmerykańskaWegetariańskaPizza();
        }
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        return pizza;
    };
}
