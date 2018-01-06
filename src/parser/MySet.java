package parser;

import java.util.HashSet;

class MySet extends HashSet<String>{

	void printContent(){
		if(isEmpty()){
			System.out.println("Set is empty.");
		}
		else {
			for(String string : this){
				System.out.println(string);
				}
			}
		}
	}

