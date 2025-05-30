package factory.pizzeria;

public class PizzaFactory {
    private static PizzaFactory mPizzaFactory;
    private PizzaFactory (){} 
    
    public static PizzaFactory getPizzaFactory(){
	if (mPizzaFactory == null)
	    {mPizzaFactory = new PizzaFactory();}
	return mPizzaFactory;
    }
    
    public Pizza generatePizza (String type){
	Pizza myPizza = null;
	if (type.equals("Cheese")) { myPizza = new Cheese();}
	if (type.equals( "Pepperoni")) { myPizza = new Pepperoni();}
	if (type.equals("Carbonara")) { myPizza = new Carbonara();}
	if (type.equals("Barbecue")) { myPizza = new Barbecue();}
	return myPizza;
    }
}
