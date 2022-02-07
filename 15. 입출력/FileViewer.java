import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException{
        FileInputStream fileinputstream = new FileInputStream(args[0]); // Resource leak: 'fileinputstream' is never closedJava(536871799)
        int data = 0;

        while ((data = fileinputstream.read()) != -1) {
            char c = (char)data;
            System.out.println(c);
        }
    }
}
