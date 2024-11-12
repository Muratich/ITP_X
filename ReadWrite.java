import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        FileInputStream inp = new FileInputStream("C:\\Users\\Марат\\IdeaProjects\\gitti\\src\\input.txt");
        FileOutputStream out = new FileOutputStream("output.txt");
        byte[] buffer = new byte[inp.available()];
        inp.read(buffer, 0, buffer.length);
        out.write(buffer, 0, buffer.length);
        inp.close();
        out.close();
    }
}