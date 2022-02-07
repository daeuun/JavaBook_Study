import java.io.*;
import java.util.ArrayList;

public class Serial {
    public static void main(String[] args) {
        try {
            String filename = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(filename);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("daeun", "1234", 20);
            UserInfo u2 = new UserInfo("dany", "5667", 30);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // 객체를 직렬화한다. (객체를 데이터스트림으로 만든다.)
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화 끝!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
