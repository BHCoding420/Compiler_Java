package tinycc.implementation.expression;





import tinycc.diagnostic.Locatable;
import tinycc.implementation.statement.Statement;

public class createExpressionImp extends Statement {

    private Locatable loc;
    private Expression expression;

    public createExpressionImp(Locatable loc,Expression expression)
    {
        this.loc = loc;
        this.expression = expression;
    }
    


    @Override
    public String toString() {
       return expression.toString();
    }
}