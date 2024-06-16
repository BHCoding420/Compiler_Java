package tinycc.implementation.expression;

import tinycc.parser.Token;

public class UnaryExp extends Expression {

    Token operator;
    boolean postfix; 
    Expression operand;

    public UnaryExp(Token operator, boolean postfix, Expression operand)
    {
        this.operator = operator; 
        this.postfix = postfix;
        this.operand = operand;
    }

    @Override
    public String toString() {
        System.out.println(this.operator.toString() + "," + this.postfix + "," + this.operand.toString());
        return "Unary_" + operator.toString() + "[" + operand.toString() + "]";
        

    }

    
    
}
