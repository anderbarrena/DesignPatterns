package state.vending;

public class NoStock implements State{
    public void order(){System.out.println("--> Out of stock!");}
}
