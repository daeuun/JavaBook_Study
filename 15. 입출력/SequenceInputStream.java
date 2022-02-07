import java.io.*;
import java.util.*;

public class SequenceInputStream {
    public static void main(String[] args) {
        byte[] arr1 = {0,1,2};    
        byte[] arr2 = {3,4,5};    
        byte[] arr3 = {6,7,8};    
        byte[] outSrc = null;

        Vector v = new Vector();
        v.add(new ByteArrayInputStream(arr1));
        v.add(new ByteArrayInputStream(arr2));
        v.add(new ByteArrayInputStream(arr3));

        // 3개의 ByteArrayInputStream을 하나의 입력스트림처럼 다루기
        SequenceInputStream input = new SequenceInputStream(v.elements());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;

        try {
            while((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (Exception e) {
        outSrc = output.toByteArray;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(outSrc));
        }


    }

}
