package state.minesWeeper;

public class Closed implements State {
    public void click(Square pSquare) {
	pSquare.changeState(new Flagged());
	System.out.println("Flagged!");
    }
}
