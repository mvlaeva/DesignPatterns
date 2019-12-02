package behavioral.interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new AndExpression(terminal1, alternation1);

        return terminal1;
    }

    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Tigers Bears";
        String context = "Lions Tigers";
//        String context = "Lions Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
