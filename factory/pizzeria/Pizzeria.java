package factory.pizzeria;

public class Pizzeria {
    public Pizzeria(){}	
    public Pizza hacerPizza (String type) {
        Pizza miPizza = PizzaFactory.getPizzaFactory().createPizza(type);
        miPizza.prepare();
        miPizza.bake();
        miPizza.cut();
        miPizza.putInAbox();
        return miPizza;
    }
    public static void main(String [ ] args)
    {
  	Pizzeria miPizzeria = new Pizzeria();      
  	Pizza bbPizza = miPizzeria.hacerPizza("Cheese");
    }
}
