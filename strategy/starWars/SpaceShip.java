package strategy.starWars;

public abstract class SpaceShip {
    private StrategyBrake strategy;
    protected SpaceShip(StrategyBrake f)
    {
	strategy = f;
    }
    public void brake() { strategy.brake(); }
    public void changeStrategy(StrategyBrake f)
    {
	this.strategy = f;
    }
}