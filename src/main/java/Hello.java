import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Hello {
	public static void main(String[] args) {
		HelloLexer lexer = new HelloLexer(new ANTLRInputStream("Hello world"));
		HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
		ParseTreeWalker visiter = new ParseTreeWalker();
		visiter.walk(new HelloVister(),parser.msg());
	}
}
