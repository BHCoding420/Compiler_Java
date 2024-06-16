package tinycc.implementation.expression;

import java.util.List;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.statement.Statement;

public class createBlockStatementImp extends Statement { 

    private Locatable loc; 
    private List<Statement> statements; 

    public createBlockStatementImp(Locatable loc,List<Statement> statements)
    {
        this.loc = loc;
        this.statements = statements;
    }

    @Override
    public String toString() {
        String s = "Block["; 

        for(Statement stat : statements)
        {
            s += stat.toString() + ",";
        } 
        if(statements.size() > 0)
        {
            s = s.substring(0, s.length() - 1);
        }
        
        s += "]";
        return s;
    }

    
    
}
