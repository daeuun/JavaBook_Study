import java.io.*;

public class BufferedOutputStream {
    public BufferedOutputStream(FileOutputStream fos) {
    }

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");

            // BufferedOutputStream  버퍼 크기 5로 지정
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }

            fos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}