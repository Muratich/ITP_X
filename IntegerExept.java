import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IntegerExept {
    public static void main(String[] args) throws IOException {
        DataInputStream  inp = new DataInputStream(new FileInputStream("C:\\Users\\Марат\\IdeaProjects\\gitti\\src\\input.txt"));
        System.out.println(inp.readInt());
    }
}
