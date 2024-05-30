package sixweek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CurrentTimeThread implements Runnable {
    private Thread thread;
    private BlockingQueue<String> queue; // BlockingQueue를 사용하여 시간 정보를 저장

    public CurrentTimeThread() {
        this.thread = new Thread(this);
        this.queue = new LinkedBlockingQueue<>();
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
                String currentTime = formatter.format(date);
                queue.put(currentTime); // 시간을 큐에 추가
                System.out.println("현재 시간: " + currentTime);
                Thread.sleep(60000); // 1분마다 시간 업데이트
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getCurrentTime() throws InterruptedException {
        return queue.take(); // 큐에서 시간을 가져옴
    }
}