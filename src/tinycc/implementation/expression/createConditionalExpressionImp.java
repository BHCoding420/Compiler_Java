package tinycc.implementation.expression;

import tinycc.implementation.statement.Statement;
import tinycc.parser.Token;

public class createConditionalExpressionImp extends Expression {

    private Token token;
    private Expression condition;
    private Expression consequence;
    private Expression alternative;

    public createConditionalExpressionImp(Token t,Expression c1,Expression c2,Expression a)
    {
        this.token = t;
        this.condition = c1;
        this.consequence = c2;
        this.alternative = a;
    }

    @Override
    public String toString() {
      String s = "If[" + condition.toString() + "," + consequence.toString();
      if(alternative != null)
      {
        s = s + "," + alternative.toString() + "]";
        return s;
      }
      s = s + "]";
      return s;
    }
    
}
