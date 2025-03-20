package state.vending;

public class VendingMain {
    public static void main(String[] args) {
		int p = 0;
		while(p<=10){
			p+=1;
	   	 	Vending.getVending().order();
		}
    }
}
