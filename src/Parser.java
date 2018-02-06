public class Parser {
    public static boolean parse(String parsing) {
        Symbols symbols;
        for (char ch: parsing.toCharArray()) {
            symbols = Symbols.getSymbolFromString(String.valueOf(ch));
            if (symbols == null) return false; //TODO: runtime exception
        }
        return true;
    }
}
