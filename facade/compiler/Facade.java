package facade.compiler;

public class Facade {

    private static Facade myFacade = new Facade();
	private Scanner scanner;
	private Parser parser;
	private NodeBuilder nodeBuilder;
	private CodeGenerator codeGenerator;

	private Facade() {
	    scanner = new Scanner();
	    parser = new Parser();
	    nodeBuilder = new NodeBuilder();
	    codeGenerator = new CodeGenerator();
	}
	public static Facade getFacade() {
	    return myFacade;
	}
	public void compile(String pFile) {
	    String file = scanner.scan(pFile);
	    file = parser.parse(file);
	    file = nodeBuilder.build(file);
	    file = codeGenerator.generate(file);
	}

}
