package hw02;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Ярик on 06.07.2017.
 */
public class Time {
    private long start;
    private long end;

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }
    public long getTime(){
        return end - start;
    }
}
