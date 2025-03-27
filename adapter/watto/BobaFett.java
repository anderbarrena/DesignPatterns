package adapter.watto;

public class BobaFett {
    public void defaultEng() {
		Engine defaultE = new Default();
		defaultE.start();
		defaultE.accelerate();
		defaultE.shutDown();
    }
    public void wattoEng() {
		Engine watto = new Adapter();
		watto.start();
		watto.accelerate();
		watto.shutDown();
    }
    public static void main (String[] args){
		BobaFett c = new BobaFett();
		c.wattoEng();
    }
}
