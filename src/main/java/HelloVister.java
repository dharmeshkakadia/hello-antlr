public class HelloVister extends HelloBaseListener {
public void enterMsg(HelloParser.MsgContext ctx){
	System.out.println("Entering Msg : " + ctx.ID().getText());
}
	public void exitMsg(HelloParser.MsgContext ctx){
		System.out.println("Exiting Msg");
	}
}
