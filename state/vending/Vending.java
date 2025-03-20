package state.vending;

public class Vending {
    private static Vending vending;
    private State state;
    private int actualChange=10;
    private int actualStock=3;
    
    private Vending(){state = new Ok();}
    public static Vending getVending(){
	    if (vending==null) { vending = new Vending();}
		return vending;
	}
    public void changeState(State pState) { state = pState; }
    public void order(){
	// Responde de manera distinta según el state
	state.order();
	}
    public boolean areThereAnyStock() {return !(actualStock == 0); }
    public boolean areThereAnyChange() {return !(actualChange == 0); }
    public void updateStock() {this.actualStock=this.actualStock-1;}
    public void updateChange() {this.actualChange=this.actualChange-1;}
}
