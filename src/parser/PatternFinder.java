package parser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternFinder {
    public static final String legitimationPattern = "(Wydana:\\s\\d\\d\\d\\d-)((((01)|(03)|(05)|(07)|(08)|(10)|(12))-((0[1-9])|([1-2]\\d)|(3[01])))|(((04)|(06)|(09)|(10)|(11))-((0[1-9])|([12]\\d)|(30)))|(02-((0[1-9])|(1\\d)|(2[0-8]))))(\\sNr\\salbumu:\\s\\d\\d\\d\\d\\d)";


    void addAllMatches(MySet set, Scanner scanner){
        Pattern pattern = makePattern();

        addAllMatchesFromLine(scanner, pattern, set);
        while(scanner.hasNextLine()){
            scanner.nextLine();
            addAllMatchesFromLine(scanner, pattern, set);
        }
    }

    private void addAllMatchesFromLine(Scanner scanner, Pattern pattern, MySet set){
        String current;
        current = scanner.findInLine(pattern);
        while(current!=null){
            set.add(current);
            current = scanner.findInLine(pattern);
        }
    }

    private Pattern makePattern(){
        return Pattern.compile(legitimationPattern);
    }
}
