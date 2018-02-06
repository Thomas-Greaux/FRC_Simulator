public enum Symbols {
    ZERO("Z"), IDENTITY("I"), SUCCESSOR("S"), LEFT("<"), RIGHT(">"), COMPOSITE("o"), RECURSIVE("R");

    private String symbol;

    Symbols(String value) {
        this.symbol = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Symbols getSymbolFromString(String c) {
        for(Symbols s : Symbols.values()) {
            if(s.getSymbol().equals(c)) return s;
        }
        return null;
    }
}
