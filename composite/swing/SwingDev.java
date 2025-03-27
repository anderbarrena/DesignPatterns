package composite.swing;

public class SwingDev {
    public static void main (String[] args){
		Component b1 = new Button();
		Component b2 = new Button();
		Component l1 = new Label();
		Panel p1 = new Panel();
		p1.addComponente(b1);
		p1.addComponente(b2);
		Panel p2 = new Panel();
		p2.addComponente(l1);
		p2.addComponente(p1);
		p1.move();
		System.out.println();
		p2.resize();
    }
}
