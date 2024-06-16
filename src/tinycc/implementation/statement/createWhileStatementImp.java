package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;

public class createWhileStatementImp extends Statement {

    Locatable loc;
    Expression condition; 
    Statement body;

    public createWhileStatementImp(Locatable loc, Expression condition, Statement body)
    {
        this.loc = loc;
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        String s = "While[" + condition.toString() + "," + body.toString() + "]";
        return s;
    }

    
    
}
