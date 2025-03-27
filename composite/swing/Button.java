package composite.swing;

public class Button implements Component {
    public void move() {
	System.out.println("Button move!");
    }
    public void resize() {
	System.out.println("Button resize!");
    }
}
