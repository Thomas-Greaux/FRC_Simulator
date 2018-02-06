public class Main {
    private static final String IN_FILE = "./res/input.txt";

    public static void main(String[] args) {
        Reader reader = new Reader(IN_FILE);
        String line;
        line = reader.readLine();
        while(line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }
}
