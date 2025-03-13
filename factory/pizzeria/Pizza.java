package factory.pizzeria;

public abstract class Pizza {
    protected Pizza(){} 
    public abstract void prepare();
    public void bake() {System.out.println("baking Pizza.");}
    public void cut() {System.out.println("cutting Pizza.");}
    public void putInAbox() {System.out.println("Pizza in da box!");}
}
