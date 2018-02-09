package Instructions;

import java.util.List;

public abstract class Instruction {
    public abstract List<Instruction> getInstructions();
    public abstract Symbols getSymbol();
    public abstract int getArity();

    @Override
    public String toString() {
        return "Instruction: " + getSymbol().getSymbol() + ", arity: " + getArity();
    }
}
