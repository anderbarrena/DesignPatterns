package factory.arkanoid;

public class BlockFactory {
    private static BlockFactory myBF;
    private BlockFactory(){}
    
    public static BlockFactory getBlockFactory(){
	if (myBF == null)
	    {myBF = new BlockFactory();}
	return myBF;
    }
    
    public Block generate (int type){
	Block blc = null;
	if (type == 1) { blc = new BlockHn0();}
	if (type == 2) { blc = new BlockHn1();}
	if (type == 3) { blc = new BlockHn2();}
	return blc;
    }
}



