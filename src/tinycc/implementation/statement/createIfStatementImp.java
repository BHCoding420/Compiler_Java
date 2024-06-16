package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;
import tinycc.parser.Token;

public class createIfStatementImp extends Statement {

    private Locatable loc;
    private Expression condition;
    private Statement consequence;
    private Statement alternative;

    public createIfStatementImp(Locatable l,Expression c1,Statement c2,Statement a)
    {
        this.loc = l;
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
