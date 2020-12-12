package chapter1.MergeInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        Interval in2 = new Interval(1,3);
        Interval in1 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        MergeInterval a = new MergeInterval();
        List<Interval> list = a.merge(intervals);
        System.out.println("결과는 =====");
        a.print(list);
    }
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.isEmpty()) {
            return intervals;
        }
        // 1. 담을 그릇
        List<Interval> result = new ArrayList<>();
        print(intervals);

        // * 정렬 방법 1(기본)
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        // * 정렬 방법 2(람다)
        intervals.sort((a,b) -> a.start - b.start);
        // * 정렬 방법 3(람다)
        intervals.sort(Comparator.comparingInt(a -> a.start));
        System.out.println("===============");
        print(intervals);

        // 2. 합치는 작업
        Interval before = intervals.get(0); // [1,3]
        for(int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if(before.end >= current.start) {
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }
        }

        // 3. 마지막꺼 넣어주는 작업
        if(!result.contains(before)) {
            result.add(before);
        }

        return result;
    }

    void print(List<Interval> intervals) {
        intervals.forEach(item -> {
            System.out.println(item.start +" : " + item.end);
        });
    }

}

class Interval {
    int start;
    int end;
    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}