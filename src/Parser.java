import Instructions.Instruction;
import Instructions.Symbols;
import Instructions.Zero;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Instruction> parse(String parsing) throws InvalidCharacter {
        List<Instruction> instructions = new ArrayList<>();
        Symbols symbol;
        for (char ch: parsing.toCharArray()) {
            symbol = Symbols.getSymbolFromString(String.valueOf(ch));
            if (symbol == null) throw new InvalidCharacter("" + ch);
            switch (symbol) {
                case ZERO: instructions.add(new Zero()); break;
            }
        }
        return instructions;
    }
}
