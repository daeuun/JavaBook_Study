public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // Runnable target

        t1.start(); // thread 실행 : 하나의 쓰레드 => start 한번 호출 
        //t1.start();  여러번 호출하면 IllegalThreadStateException 발생
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()); // currentThread 메소드로 쓰레드에 대한 참조를 얻어온다.
        }
    }
}