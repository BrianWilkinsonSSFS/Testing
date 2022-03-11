import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DayTenPartTwo {

    private static Stack<Character> symbols;

    public static void main(String[] args) throws FileNotFoundException {
        int score;
        Scanner scan = new Scanner(new File("files/dayTen.txt"));
        ArrayList<Long> values = new ArrayList<>();
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            score = processLine(input);
            if (!symbols.empty() && score == 0) {
                values.add(processStack());
            }
        }
        Collections.sort(values);
        System.out.println(values.get(values.size()/2));
    }

    public static Long processStack() {
        Long total = 0L;
        while (!symbols.empty()) {
            total *= 5;
            char next = symbols.pop();
            if (next == '(') total+=1;
            else if (next == '[') total+=2;
            else if (next == '{') total+=3;
            else if (next == '<') total+=4;
        }
        return total;
    }

    public static int processLine(String line) {
        symbols = new Stack<>();
        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i) == '(' || line.charAt(i) == '[' || line.charAt(i) == '{' ||
                    line.charAt(i) == '<') {
                symbols.push(line.charAt(i));
            } else {
                if (symbols.empty())
                    return 0;
                else {
                    if (!matches(symbols.pop(), line.charAt(i))) {
                        if (line.charAt(i) == ')') return 3;
                        else if (line.charAt(i) == ']') return 57;
                        else if (line.charAt(i) == '}') return 1197;
                        else if (line.charAt(i) == '>') return 25137;
                    }
                }
            }
        }
        return 0;
    }

    public static boolean matches(char open, char close) {
        String opening = "({[<";
        String closing = ")}]>";
        return opening.indexOf(open) == closing.indexOf(close);
    }
}
