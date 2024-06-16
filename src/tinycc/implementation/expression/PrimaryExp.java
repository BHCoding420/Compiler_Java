package tinycc.implementation.expression;

import tinycc.parser.Token;
import tinycc.parser.TokenKind;

public class PrimaryExp extends Expression {

    private Token token;

    public PrimaryExp(Token t)
    {
        this.token = t;
    } 
    @Override
    public String toString() {
        
        if(token.getKind() == TokenKind.IDENTIFIER)
        {
            String s = "Var_" + token.getText(); 
            return s;
        } 
        else if(token.getKind() == TokenKind.NUMBER)
        {
            String s = "Const_" + token.toString();  
            return s; 

        }   
        else if(token.getKind() == TokenKind.CHARACTER)
        {
            String s = "Const_" +   token.toString() ; 
            return s;

        } 
        else 
        {
            String s = token.toString();
            String output = "Const_" + s ;
            return output;


        } 
    }


    
}
