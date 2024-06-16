package tinycc.implementation.type;
import java.util.List;

public class FunctionType extends Type {
    Type returnType;
    List<Type> parameters;
    public FunctionType(Type returnType,List<Type> parameters)
    {
        this.returnType = returnType;
        this.parameters = parameters;
    }
    @Override
    public String toString() {
       String param = returnType.toString();

       
       if(parameters.size() == 0)
       {
            return "FunctionType[" + param + "]";
       }

       for(Type par : parameters)
       {
            param += "," + par ;
       } 
       //param = param.substring(0, param.length() - 1);

       return "FunctionType[" + param + "]";

    }




}
