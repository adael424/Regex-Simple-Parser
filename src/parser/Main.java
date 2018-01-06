package parser;


class Main {

	public static void main(String[] args) {
		Interpreter interpreter = new Interpreter();
		MySet result = interpreter.executeCalculation(args);
		if(result!=null){
			result.printContent();
		}
	}
}
