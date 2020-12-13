package chapter1.MeetingRoom;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1. sorting 으로 정렬
 * 2. hold.end 와 new.start 를 비교
 */
public class MeetingRoom {
    public boolean solve(Interval[] intervals) {
        // null 체크
        if(intervals == null) return false;
        
        Arrays.sort(intervals,Comp);
        // hold.end 와 new.start 비교
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }
        return true;

    }
    // sorting
    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };
    
    public void print(Interval[] intervals) {
        for(int i = 0; i <intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }
}

class Interval {
    int start;
    int end;
    Interval() {
        this.start = 0;
        this.end = 0;
    }
    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }

    @Override
    public String toString() {
        return start + " / " + end;
    }
}