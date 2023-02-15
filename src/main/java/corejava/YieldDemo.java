package corejava;

class MyThread1 extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            Thread.yield();
            System.out.println("run method execution");
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1();
        t.start();
        for(int i=0; i<5; i++) {
            System.out.println("Main method execution");
        }
    }
}
