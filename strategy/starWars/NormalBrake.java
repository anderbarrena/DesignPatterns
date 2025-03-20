package strategy.starWars;

public class NormalBrake implements StrategyBrake {
    public void brake() {
	System.out.println("using the normal brake!");
    }
}
