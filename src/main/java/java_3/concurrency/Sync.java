package main.java.java_3.concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    private List nums = new ArrayList<>();
    Counter counter = null;

    Sync(String name) {
        super(name);
    }

    Sync(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for(int i=0; i<100; i++) {
            int randInt = rand.nextInt(100);
            this.nums.add(randInt);
        }

        if (counter != null) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " got value: " + counter.getNext());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List getNums() {
        return nums;
    }
}