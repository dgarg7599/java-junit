package com.bridgelabz;

public class PerformanceUtil {

    public String longRunningTask() {

        try{
            Thread.sleep(3000);  // Simulates 3 seconds of processing
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return "Task Completed";

    }
}
