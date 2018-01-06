package parser;

public class Intersection extends OperationWithCheck implements Operation{
    @Override
    public void calculate(SetsStack setsStack) {
            MySet upperPoppedSet = setsStack.pop();
            MySet lowerPoppedSet = setsStack.pop();
            MySet resultSet = new MySet();
            boolean stringStays;
            for(String stringFromUpper: upperPoppedSet){
                stringStays = false;
                for(String stringFromLower: lowerPoppedSet){
                    if(stringFromUpper.equals(stringFromLower)){
                        stringStays = true;
                    }
                }
                if(stringStays){
                    resultSet.add(stringFromUpper);
                }
            }
            setsStack.push(resultSet);
    }
}
