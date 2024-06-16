package tinycc.parser;

import java.util.List;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.BaseImp;
import tinycc.implementation.expression.BinaryExp;
import tinycc.implementation.expression.Expression;
import tinycc.implementation.expression.PrimaryExp;
import tinycc.implementation.expression.UnaryExp;
import tinycc.implementation.expression.createBlockStatementImp;
import tinycc.implementation.expression.createCallExpressionImp;
import tinycc.implementation.expression.createConditionalExpressionImp;
import tinycc.implementation.expression.createExpressionImp;
import tinycc.implementation.statement.Statement;
import tinycc.implementation.statement.createDeclarationStatementImp;
import tinycc.implementation.statement.createIfStatementImp;
import tinycc.implementation.statement.createReturnStatementImp;
import tinycc.implementation.statement.createWhileStatementImp;
import tinycc.implementation.type.FunctionType;
import tinycc.implementation.type.PointerType;
import tinycc.implementation.type.Type; 


public class Astimp implements ASTFactory{

    @Override
    public Statement createBlockStatement(Locatable loc, List<Statement> statements) {
        return new createBlockStatementImp(loc, statements);
    }

    @Override
    public Statement createDeclarationStatement(Type type, Token name, Expression init) {
       return new createDeclarationStatementImp(type, name, init);
    }

    @Override
    public Statement createExpressionStatement(Locatable loc, Expression expression) {
        return new createExpressionImp(loc, expression);
    }

    @Override
    public Statement createIfStatement(Locatable loc, Expression condition, Statement consequence,
            Statement alternative) {
        return new createIfStatementImp(loc, condition, consequence, alternative);
    }

    @Override
    public Statement createReturnStatement(Locatable loc, Expression expression) {
        return new createReturnStatementImp(loc, expression);
    }

    @Override
    public Statement createWhileStatement(Locatable loc, Expression condition, Statement body) {
        return new createWhileStatementImp(loc, condition, body);
    }

    @Override
    public Type createFunctionType(Type returnType, List<Type> parameters) {
        return new FunctionType(returnType, parameters);
    }

    @Override
    public Type createPointerType(Type pointsTo) {
        return new PointerType(pointsTo);
    }

    @Override
    public Type createBaseType(TokenKind kind) {
        return new BaseImp(kind);
    }

    @Override
    public Expression createBinaryExpression(Token operator, Expression left, Expression right) {
        return new BinaryExp(left, right, operator);
    }

    @Override
    public Expression createCallExpression(Token token, Expression callee, List<Expression> arguments) {
        return new createCallExpressionImp(token, callee, arguments);
    }

    @Override
    public Expression createConditionalExpression(Token token, Expression condition, Expression consequence,
            Expression alternative) {
        return new createConditionalExpressionImp(token, condition, consequence, alternative);
    }

    @Override
    public Expression createUnaryExpression(Token operator, boolean postfix, Expression operand) {
        return new UnaryExp(operator, postfix, operand);
    }

    @Override
    public Expression createPrimaryExpression(Token token) {
         
        return new PrimaryExp(token);
        
    }

    @Override
    public void createExternalDeclaration(Type type, Token name) {
        String t = type.toString(); 
        String s = name.toString();
    }

    @Override
    public void createFunctionDefinition(Type type, Token name, List<Token> parameterNames, Statement body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFunctionDefinition'");
    }
    
}
