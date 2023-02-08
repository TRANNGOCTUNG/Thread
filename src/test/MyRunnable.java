package test;

public class Test implements Runnable{

    @Override
    public void run() {
        new Thread(MyRunnable).run();
    }
}
