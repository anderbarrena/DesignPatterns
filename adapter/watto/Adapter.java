package adapter.watto;

public class Adapter implements Engine {
    private Watto motorElectrico = new Watto();
    public void start() {
	motorElectrico.connect();
	motorElectrico.activavate();
    }
    public void accelerate() {
	motorElectrico.increase();
    }
    public void shutDown() {
	motorElectrico.stop();
	motorElectrico.disconnect();
    }
}
