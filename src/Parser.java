public class Parser {
    public static void parse(String parsing) throws InvalidCharacter {
        Symbols symbols;
        for (char ch: parsing.toCharArray()) {
            symbols = Symbols.getSymbolFromString(String.valueOf(ch));
            if (symbols == null) throw new InvalidCharacter("" + ch);
        }
    }
}
