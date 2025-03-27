package composite.swing;

import java.util.*;

public class Panel implements Component {

    private ArrayList<Component> components = new ArrayList<Component>();
    public void addComponente(Component pF) {
	components.add(pF);
    }
    public void delComponente(Component pF) {
	components.remove(pF);
    }
    public void move() {
		System.out.println("Panel move!");
		Iterator<Component> it = components.iterator();
		while(it.hasNext()){
		    Component f = it.next();
		    f.move();
		}
    }
    public void resize() {
		System.out.println("Panel resize!");
			Iterator<Component> it = components.iterator();
		while(it.hasNext()){
	   	 	Component f = it.next();
	    	f.resize();
		}
    }
}
