class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        
        Runnable r = new Thread1_2();
        Thread t2 = new Thread(r); // Runnable target

        t1.start(); // thread 실행 : 하나의 쓰레드 - ㄴ
        t2.start(); 
    }
}