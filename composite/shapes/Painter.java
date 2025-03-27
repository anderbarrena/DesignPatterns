package composite.shapes;

public class Painter {
    public static void main (String[] args){
		Shape ci = new Circle();
		Shape cu = new Square();
		Shape tr = new Triangle();
		Composite comp1 = new Composite();
		comp1.addComponent(ci);
		comp1.addComponent(cu);
		Composite comp2 = new Composite();
		comp2.addComponent(tr);
		comp2.addComponent(comp1);
		comp1.paint();
		System.out.println();
		comp2.paint();
    }
}
