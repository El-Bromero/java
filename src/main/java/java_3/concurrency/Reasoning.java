package main.java.java_3.concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. Reasoning should be created by inheriting from the Thread class.

    @Override
    public void run() {
        distinguish();
    }

    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.
        System.out.println("A thread is a lightweight process that shares info with its peer threads");
        System.out.println("While a process is a program under execution");
        System.out.println("If you invoke the run() method of a thread instead of start() method of a thread then you will call the run method on the thread it is calling from");
        System.out.println("instead of a new thread. With start() you create a new thread and then run() method is executed on the new thread.");
    }
}

