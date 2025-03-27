package composite.swing;

public class Label implements Component {
    public void move() {
	System.out.println("Label move!");
    }
    public void resize() {
	System.out.println("Label resize!");
    }
}
