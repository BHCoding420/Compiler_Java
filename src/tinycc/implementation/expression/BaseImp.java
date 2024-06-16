package tinycc.implementation.expression;

import tinycc.implementation.type.Type;
import tinycc.parser.TokenKind;

public class BaseImp extends Type {

    private TokenKind kind;

    public BaseImp(TokenKind k)
    {
        this.kind = k;
    }

    @Override
    public String toString() {
        return "Type_" + kind.toString();
    }

    
    
}
