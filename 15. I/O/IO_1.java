import java.io.*;
import java.util.Arrays;

/**
 * IO_1
 */
class IO_1 { 

   public static void main(String[] args) {
       byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
       byte[] outSrc = null;

       ByteArrayInputStream input = null;
       ByteArrayOutputStream output = null;
  
       input = new ByteArrayInputStream(inSrc);
       output = new ByteArrayOutputStream();

       int data = 0;

       while((data = input.read()) != -1) { // read()를 호출한 반환값을 data에 저장한다.
           output.write(data);
       }

       outSrc = output.toByteArray(); // 스트림 배열 byte배열로 반환 

       System.out.println("Input source : " + Arrays.toString(inSrc));
       System.out.println("Output source : " + Arrays.toString(outSrc));
   }
}