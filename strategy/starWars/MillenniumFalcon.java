package strategy.starWars;

public class MillenniumFalcon extends SpaceShip {
    public MillenniumFalcon()
    {
	super(new InterStellarBrake());
    }	
}
