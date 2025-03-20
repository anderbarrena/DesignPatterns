package strategy.starWars;

public class StarWarsMain {
    public static void main (String[] args){
		SpaceShip a1 = new Xwing ();
		SpaceShip a2 = new MillenniumFalcon ();
		a1.brake();
		a2.brake();
		a2.changeStrategy(new NormalBrake());
		a2.brake();
    }
}
