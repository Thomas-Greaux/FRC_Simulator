package Instructions;

import java.util.ArrayList;
import java.util.List;

public class Zero extends Instruction {
    private static final Symbols symbol = Symbols.ZERO;
    private static final int arity = 0;

    private static final List<Instruction> instructions = new ArrayList<>();

    @Override
    public List<Instruction> getInstructions() {
        return instructions;
    }

    @Override
    public Symbols getSymbol() {
        return symbol;
    }

    @Override
    public int getArity() {
        return arity;
    }
}
