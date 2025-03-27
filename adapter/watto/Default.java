package adapter.watto;

public class Default implements Engine {
    public void start() {
	System.out.println("Default: start");
    }
    public void accelerate() {
	System.out.println("Default: accelerate");
    }
    public void shutDown() {
	System.out.println("Default: shutDown");
    }
}
