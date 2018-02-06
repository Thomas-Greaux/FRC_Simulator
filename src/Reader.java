import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private String filepath;
    private BufferedReader br;

    public Reader(String filepath) {
        this.filepath = filepath;
        try {
            br = new BufferedReader(new FileReader(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String readLine() {
        String res = null;
        try {
            res = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
