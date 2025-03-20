package state.minesWeeper;

public class Square {
    private State state;
    public Square()
    {
	this.state = new Closed();
    }
    public void changeState(State pState)
    {
	this.state = pState;
    }	
    public void click()
    {
	this.state.click(this);
    }	   
}
