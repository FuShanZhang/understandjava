
class MyRunnable implements Runnable {



    private static int count = 0;

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable, "A");
        Thread thread2 = new Thread(myRunnable, "B");
        Thread thread3 = new Thread(myRunnable, "C");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }
}

