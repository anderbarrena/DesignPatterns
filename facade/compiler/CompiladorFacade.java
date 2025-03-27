public class CompiladorFacade {

    private static CompiladorFacade mCompiladorFacade = new CompiladorFacade();
	private Scanner scanner;
	private Parser parser;
	private NodeBuilder nodeBuilder;
	private CodeGenerator codeGenerator;

	private CompiladorFacade() {
	    scanner = new Scanner();
	    parser = new Parser();
	    nodeBuilder = new NodeBuilder();
	    codeGenerator = new CodeGenerator();
	}
	public static CompiladorFacade getFacade() {
	    return mCompiladorFacade;
	}
	public void compile(String pFile) {
	    String file = scanner.scan(pFile);
	    file = parser.parse(file);
	    file = nodeBuilder.build(file);
	    file = codeGenerator.generate(file);
	}

}
