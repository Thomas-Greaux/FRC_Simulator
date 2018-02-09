import Instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //private static final String IN_FILE = "./res/input.txt";
    //private static final String IN_FILE = "./res/badinput.txt";
    //private static final String IN_FILE = "./res/zero.txt";
    private static final String IN_FILE = "./res/zeros.txt";

    public static void main(String[] args) {
        List<Instruction> instructions = new ArrayList<>();
        Reader reader = new Reader(IN_FILE);
        String line;
        line = reader.readLine();
        while (line != null) {
            try {
                instructions.addAll(Parser.parse(line));
                System.out.println(line);
                line = reader.readLine();
            } catch (InvalidCharacter invalidCharacter) {
                invalidCharacter.printStackTrace();
                return;
            }
        }

        for(Instruction i : instructions) {
            System.out.println(i.toString());
        }
    }
}
