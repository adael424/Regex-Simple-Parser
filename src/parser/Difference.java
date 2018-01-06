package parser;

public class Difference extends OperationWithCheck implements Operation {
    @Override
    public void calculate(SetsStack setsStack) {
            MySet upperPoppedSet = setsStack.pop();
            MySet lowerPoppedSet = setsStack.pop();
            for (String stringFromUpper : upperPoppedSet) {
                lowerPoppedSet.remove(stringFromUpper);
            }

            setsStack.push(lowerPoppedSet);
    }
}
