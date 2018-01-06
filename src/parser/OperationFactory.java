package parser;

public class OperationFactory {
    Operation expression(String string){
        switch(string)
        {
            case "*":
                return new Intersection();

            case "+":
                return new Sum();

            case "-":
                return new Difference();

            default:
                return new AddElement(string);
        }
    }
}
