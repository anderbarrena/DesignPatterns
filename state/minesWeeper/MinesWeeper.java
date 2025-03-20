package state.minesWeeper;

import java.util.*;
public class MinesWeeper {
    private static MinesWeeper mMinesWeeper = new MinesWeeper();
    private ArrayList<Square> squares;
    private MinesWeeper(){
	this.squares=new ArrayList<Square>();
	for (int x=0; x<9; x++){
	    squares.add(new Square());
	}
    }
    public static MinesWeeper getMinesWeeper(){
	return mMinesWeeper;
    }
    public void click (int pos){
	squares.get(pos).click();
    }
}
