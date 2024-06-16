package tinycc.implementation.expression;

import java.util.List;

import tinycc.parser.Token;

public class createCallExpressionImp extends Expression {
    Token token; 
    Expression callee; 
    List<Expression> arguments; 

    public createCallExpressionImp(Token token, Expression callee, List<Expression> arguments)
    {
        this.token = token;
        this.callee = callee;
        this.arguments = arguments;
    }
    @Override
    public String toString() {
       String s = "Call";
       String args = callee.toString();

       if(arguments.size() == 0)
       {
        return s + "[" + args + "]";
       } 

       
       for(Expression a : arguments)
       {
            args += "," + a.toString();
       } 
       return s + "[" + args + "]";

    }


}
