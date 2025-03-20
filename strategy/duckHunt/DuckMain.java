package strategy.duckHunt;

public class DuckMain {
    public static void main (String[] args){
		Duck duck = new Duck();
		duck.quack();
		duck.fly();
		duck.changeStrategyFly(new VeryFastFly());
		duck.changeStrategyQuack(new VeryLoudQuack());
		duck.quack();
		duck.fly();
    }
}
