package StopWatch;

import java.util.Date;
import java.util.Scanner;

public class stopWatch {
    long startTime;
    long endTime;
    public stopWatch() {
    }
    public long Start(){
        startTime = new Date().getTime();
        return startTime;
    }
    public  long Stop(){
        endTime = new Date().getTime();
        return endTime;
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
