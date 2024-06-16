package tinycc.implementation.statement;

import tinycc.implementation.expression.Expression;
import tinycc.implementation.type.Type;
import tinycc.parser.Token;

public class createDeclarationStatementImp extends Statement {

    private Type type;
    private Token name; 
    private Expression init; 

    public createDeclarationStatementImp(Type type,Token name,Expression init)
    {
        this.type = type;
        this.name = name;
        this.init = init;
    }

    @Override
    public String toString() {  
        String s;
        if(init == null)
        {
            s = "Declaration_" + name.toString() + "[" + type.toString() + "]";
        } 
        else
        {
            s = "Declaration_" + name.toString() + "[" + type.toString() + "," + init.toString() + "]";
        }
   
       return s;
    }
    
}
