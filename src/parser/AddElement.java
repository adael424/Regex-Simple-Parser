package parser;

import java.util.Scanner;

public class AddElement implements Operation {
    private static PatternFinder patternFinder = new PatternFinder();
    private static FileHandler fileHandler = new FileHandler();

    public final String path;


    AddElement(String path){
        this.path=path;
    }

    @Override
    public boolean start(SetsStack setsStack) {
        MySet newSet= setHFromFile(path);
        if(newSet!=null){
            setsStack.add(newSet);
            return true;
        }
        else return false;
    }

    private MySet setHFromFile(String fileName){
        MySet newSet = new MySet();
        Scanner scanner = fileHandler.openFile(fileName);
        if(scanner!=null) {
            patternFinder.addAllMatches(newSet, scanner);
            return  newSet;
        }
        else
        return  null;
    }
}
