import java.io.*;
import java.util.Arrays;

/**
 * IO_1
 */
class IO_2 { 

   public static void main(String[] args) {
       byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
       byte[] outSrc = null;
       byte[] temp = new byte[10];

       ByteArrayInputStream input = null;
       ByteArrayOutputStream output = null;

       input = new ByteArrayInputStream(inSrc);
       output = new ByteArrayOutputStream();

       input.read(temp, 0, temp.length); // 읽어온 데이터를 배열에 담는다.
       output.write(temp, 5, 5); // temp[5]로부터 5개의 데이터를 write한다. 

       outSrc = output.toByteArray(); // 스트림 배열 byte배열로 반환 

       System.out.println("Input source : " + Arrays.toString(inSrc));
       System.out.println("temp : "         + Arrays.toString(temp));
       System.out.println("Output source : " + Arrays.toString(outSrc));
   }
}