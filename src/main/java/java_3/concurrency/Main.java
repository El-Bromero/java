package java_3.concurrency;


public class Main {

    public static void main(String[] args) throws InterruptedException {
         //run all of your threads from this main class.
        Sync syncThread = new Sync("sync thread");
        syncThread.start();
        syncThread.join(); // Wrote join here for the comment below this line
        System.out.println(syncThread.getNums());  //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up here.
        /*
            -Create 5 sync threads
            -Allow the list of nums to be a shared resource amongst all of the threads.
            -Protect the List from thread interference using a thread blocking technique, such as synchronization or an Atomic data structure.
        */
        // I created a counter class that holds a nums array list that will hold increments of 1. So 10 increments from each thread. 50 underneath. All these 5 threads share same list
        Counter counter = new Counter();

        Sync syncThread2 = new Sync("sync thread2", counter);
        Sync syncThread3 = new Sync("sync thread3", counter);
        Sync syncThread4 = new Sync("sync thread4", counter);
        Sync syncThread5 = new Sync("sync thread5", counter);
        Sync syncThread6 = new Sync("sync thread6", counter);
        syncThread2.start();
        syncThread3.start();
        syncThread4.start();
        syncThread5.start();
        syncThread6.start();
        syncThread2.join();
        syncThread3.join();
        syncThread4.join();
        syncThread5.join();
        syncThread6.join();
        System.out.println("Shared nums arraylist: " + counter.getNums());
        System.out.println();


        // I see no instructions on calling Reasoning. So I included here
        Reasoning reason = new Reasoning();
        reason.start();
        reason.join();
        System.out.println();

        /*
            Kick off a Team Thread here.
            Set the name of the thead to be your agile team name.
        */
        Team returnSleep = new Team("ReturnSleep");
        Thread returnSleepThread = new Thread(returnSleep);
        returnSleepThread.start();
    }
}