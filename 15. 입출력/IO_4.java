import java.io.*;
import java.util.Arrays;

public class IO_4 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];
 
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
 
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        
        
        try {
            while(input.available() > 0) { // available : blocking없이 읽어올 수 있는 바이트 수 반환
                int len = input.read(temp);
                output.write(temp, 0, len); // 값을 읽어온 만큼 = len 출력함
            }
        } catch (Exception e) {}
        
        outSrc = output.toByteArray(); // 스트림 배열 byte배열로 반환 

        System.out.println("Input source : " + Arrays.toString(inSrc));
        System.out.println("temp : "         + Arrays.toString(temp)); 
        System.out.println("Output source : " + Arrays.toString(outSrc)); // Output source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
    
}
