package strategy.starWars;

public class Xwing extends SpaceShip {
    public Xwing()
    {
	super(new NormalBrake());
    }	
}
