public class Pizzeria {
    public Pizzeria(){}	
    public Pizza hacerPizza (String tipo){
  	Pizza miPizza = PizzaFactory.getPizzaFactory().createPizza(tipo);
  	miPizza.preparar();
  	miPizza.hornear();
  	miPizza.cortar();
  	miPizza.meterEnCaja();
        return miPizza;
    }
    public static void main(String [ ] args)
    {
  	Pizzeria miPizzeria = new Pizzeria();      
  	Pizza bbPizza = miPizzeria.hacerPizza("Barbacoa");
    }
}
