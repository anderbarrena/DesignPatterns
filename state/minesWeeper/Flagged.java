package state.minesWeeper;

public class Flagged implements State {
    public void click(Square pSquare){
	pSquare.changeState(new Closed());
	System.out.println("unFlagged!");
    }
}
