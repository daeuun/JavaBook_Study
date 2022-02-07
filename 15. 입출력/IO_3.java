import java.io.*;
import java.util.Arrays;

public class IO_3 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];
 
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
 
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        
        System.out.println("Input source : " + Arrays.toString(inSrc));
        
        try {
            while(input.available() > 0) { // available : blocking없이 읽어올 수 있는 바이트 수 반환
                input.read(temp);
                output.write(temp);
                System.out.println("temp : "         + Arrays.toString(temp));
                
                outSrc = output.toByteArray(); // 스트림 배열 byte배열로 반환 
                printArrays(temp, outSrc);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    static void printArrays(byte[] temp, byte[] outSrc) {
        System.out.println("temp : "         + Arrays.toString(temp)); 
        System.out.println("Output source : " + Arrays.toString(outSrc)); // Output source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7] temp에 남아있던 6, 8까지 출력!
    }
    
}
