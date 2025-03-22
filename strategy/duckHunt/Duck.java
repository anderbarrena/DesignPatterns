package strategy.duckHunt;

public class Duck {
    private StrategyFly strategyFly = new NormalFly();
    private StrategyQuack strategyQuack = new NormalQuack();
    public void fly(){
	    strategyFly.fly();
    }
    public void quack(){
	    strategyQuack.quack();
    }
    public void changeStrategyFly(StrategyFly sv){
	this.strategyFly=sv;
    }
    public void changeStrategyQuack(StrategyQuack sc){this.strategyQuack=sc;}
}
