public class Main {
    private static final String IN_FILE = "./res/input.txt";
    //private static final String IN_FILE = "./res/badinput.txt";

    public static void main(String[] args) {
        Reader reader = new Reader(IN_FILE);
        String line;
        line = reader.readLine();
        while (line != null) {
            try {
                Parser.parse(line);
                System.out.println(line);
                line = reader.readLine();
            } catch (InvalidCharacter invalidCharacter) {
                invalidCharacter.printStackTrace();
                return;
            }

        }
    }
}
