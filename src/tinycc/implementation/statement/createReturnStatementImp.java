package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class createReturnStatementImp extends Statement {

    Locatable loc; 
    Expression expression;

    public createReturnStatementImp(Locatable loc, Expression expression)
    {
        this.loc = loc;
        this.expression = expression;
    }

    @Override
    public String toString() { 
        if(expression != null)
        {
        return "Return" + "[" + expression.toString() + "]";
        }
        return "Return[]";
    }

    
    
}
