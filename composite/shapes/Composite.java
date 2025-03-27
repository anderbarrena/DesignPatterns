package composite.shapes;

import java.util.*;

public class Composite implements Shape {
    private ArrayList<Shape> components = new ArrayList<Shape>();
    public void addComponent(Shape pF) {
	components.add(pF);
    }
    public void delComponent(Shape pF) {
	components.remove(pF);
    }
    public void paint() {
	    Iterator<Shape> it = components.iterator();
    	while(it.hasNext()){
    	    Shape f = it.next();
    	    f.paint();
    	}
    }
}
