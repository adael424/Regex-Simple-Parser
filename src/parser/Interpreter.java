package parser;

class Interpreter {
	SetsStack setsStack;

	Interpreter(){
		setsStack = new SetsStack();
	}
		MySet executeCalculation(String[] calculation){
			OperationFactory operationFactory = new OperationFactory();

			for(int i = 0; i < calculation.length; i++){
			if(!(operationFactory.expression(calculation[i]).start(setsStack))){
				return null;
			}
			}

			return setsStack.returnResult();
		}


	}