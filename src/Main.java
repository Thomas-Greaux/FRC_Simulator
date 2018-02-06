public class Main {
    private static final String IN_FILE = "./res/input.txt";
    //private static final String IN_FILE = "./res/badinput.txt";

    public static void main(String[] args) {
        Reader reader = new Reader(IN_FILE);
        String line;
        line = reader.readLine();
        while(line != null) {
            if (Parser.parse(line)) {
                System.out.println(line);
                line = reader.readLine();
            } else {
                System.out.println("Syntax error : " + line);
                return;
            }
        }
    }
}
