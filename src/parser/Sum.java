package parser;

public class Sum extends OperationWithCheck implements Operation {
    @Override
    public void calculate(SetsStack setsStack) {
            MySet upperPoppedSet = setsStack.pop();
            MySet lowerPoppedSet = setsStack.pop();
            MySet resultSet = new MySet();
            resultSet.addAll(upperPoppedSet);
            resultSet.addAll(lowerPoppedSet);
            setsStack.push(resultSet);
    }
}
