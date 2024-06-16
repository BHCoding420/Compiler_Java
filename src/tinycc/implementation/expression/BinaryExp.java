package tinycc.implementation.expression;

import tinycc.parser.Token;

public class BinaryExp extends Expression {


    private Token operator; 
    private Expression left,right;

    public BinaryExp(Expression l,Expression r,Token o)
    {
        this.left = l;
        this.right = r; 
        this.operator = o;
    }


    @Override
    public String toString() {
        String s = "Binary_" + operator.getKind() + "[" + left.toString() + "," + right.toString() + "]";
        return s;
    }
    
}
