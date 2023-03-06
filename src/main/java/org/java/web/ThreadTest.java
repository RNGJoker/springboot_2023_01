package org.java.web;

import java.util.concurrent.*;

/**
 * @author: Joker
 * @createTime: 2023-02-20 14:58
 */
public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 3; i++) {
            int i1 = i;
            executorService.execute(() -> {
                Thread.currentThread().setName("\t"+ i1);
                System.out.println("线程【" + Thread.currentThread().getName() + "】正在办理业务...");
            });
        }
        executorService.shutdown();
    }
}
