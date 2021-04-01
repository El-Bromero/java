package java_3.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List nums = new ArrayList<>();
    private int count = 0;

    public synchronized int getNext() {
        count++;
        nums.add(count);
        return count;
    }

    public List getNums() {
        return nums;
    }
}