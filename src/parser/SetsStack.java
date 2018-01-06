package parser;

import java.util.Stack;

class SetsStack extends Stack<MySet>{

	private static final long serialVersionUID = 1L;

	boolean canDoOperation(){
		return !(isEmpty()|| exactlyOneElement());
	}

	boolean exactlyOneElement(){ if(!isEmpty())
		return firstElement()==lastElement();
	else return false;}

	MySet returnResult(){
		if (exactlyOneElement())
			return firstElement();
		else
			System.out.println("Incorrect number of sets to operate on.");
			return null;
	}

}
