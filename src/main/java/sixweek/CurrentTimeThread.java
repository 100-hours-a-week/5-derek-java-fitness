package sixweek;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeThread implements Runnable {
    private Thread thread;

    public CurrentTimeThread() {
        this.thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                System.out.println("현재 시간: " + formatter.format(date));
                Thread.sleep(60000); // 1분마다 시간 업데이트
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}