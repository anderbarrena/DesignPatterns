package state.vending;

public class Ok implements State{
    public Ok() {}
    public void order(){
	System.out.println("--> Water ordered!");
	Vending.getVending().updateStock();
	Vending.getVending().updateChange();
	if (!Vending.getVending().areThereAnyChange())
	    Vending.getVending().changeState(new NoChange());
	if (!Vending.getVending().areThereAnyStock())
	    Vending.getVending().changeState(new NoStock());
    }
}
