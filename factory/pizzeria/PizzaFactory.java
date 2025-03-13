public class PizzaFactory {
    private static PizzaFactory mPizzaFactory;
    private PizzaFactory (){} 
    
    public static PizzaFactory getPizzaFactory(){
	if (mPizzaFactory == null)
	    {mPizzaFactory = new PizzaFactory();}
	return mPizzaFactory;
    }
    
    public Pizza createPizza (String tipo){
	Pizza miPizza = null;
	if (tipo.equals("Queso")) { miPizza = new Queso();}
	else if (tipo.equals( "Pepperoni")) { miPizza = new Pepperoni();}
	else if (tipo.equals("Carbonara")) { miPizza = new Carbonara();}
	else if (tipo.equals("Barbacoa")) { miPizza = new Barbacoa();}
	return miPizza;
    }
}
