public class Thread1_2 {
    public static void main(String[] args) throws Exception {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
    }
}

class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();
    }

    private void throwException() {
        try {
            throwException();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
