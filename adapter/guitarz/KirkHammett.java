package adapter.guitarz;

public class KirkHammett {
    public void playAcoustic() {
		Guitar g = new Adapter();
		g.turnOn();
		g.turnOff();
    }
    public void playElectric() {
		Guitar g = new Electric();
		g.turnOn();
		g.turnOff();
    }
    public static void main (String[] args){
		KirkHammett c = new KirkHammett();
		c.playAcoustic();
		c.playElectric();
    }
}
