package adapter.guitarz;

public class Adapter implements Guitar {
    private Acoustic acoustic = new Acoustic();
    public void turnOn() {acoustic.play();}
    public void turnOff() {
	acoustic.stop();
    }
}
