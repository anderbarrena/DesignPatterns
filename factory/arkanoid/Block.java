package factory.arkanoid;

public abstract class Block {
    protected Block(){}
    public void bounce(){
	    int d = getHarness()- 1;
	    if (d==0){
	        destroy();
	    }
    }
    private void destroy (){
	System.out.println("Destroyed!");
    }  
    public abstract int getHarness();
}
