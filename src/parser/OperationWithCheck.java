package parser;

public abstract class OperationWithCheck implements Operation{
    @Override
    public boolean start(SetsStack setsStack){
        if(setsStack.canDoOperation()) {
            calculate(setsStack);
            return true;
        }
        else
        {
            System.out.println("Too many operations.");
            return false;
        }
    }
    abstract void calculate(SetsStack setsStack);
}
