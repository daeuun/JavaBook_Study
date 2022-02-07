import java.io.*;

public class BufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("BufferReader.java");
            BufferedReader bReader = new BufferedReader(fReader);

            String line = "";
            for(int i=1; (line = bReader.readLine()) != null; i++) {
                if(line.indexOf(";") != -1)
                    System.out.println(i + ":" + line);
            }
        } catch (Exception e) {}
    }
}
