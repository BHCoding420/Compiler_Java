package tinycc.implementation.type;

public class PointerType extends Type {


    Type pointsTo;

    public PointerType(Type pointsTo)
    {
        this.pointsTo = pointsTo;

    }
    @Override
    public String toString() {
        return "Pointer[" + pointsTo.toString() + "]";
    }

    
    
}
