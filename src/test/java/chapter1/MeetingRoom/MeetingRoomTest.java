package chapter1.MeetingRoom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeetingRoomTest {
    MeetingRoom room;
    MeetingRoom2 room2;

    @Before
    public void setUp() throws Exception {
        room = new MeetingRoom();
        room2 = new MeetingRoom2();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solve() {
        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};

        System.out.println(room.solve(intervals));
    }
    @Test
    public void solve2() {
        Interval in1 = new Interval(7, 10);
        Interval in2 = new Interval(2, 4);

        Interval[] intervals = {in1, in2};

        System.out.println(room.solve(intervals));
    }

    @Test
    public void solve3() {
        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};

        System.out.println(room2.solve(intervals));
    }
    @Test
    public void solve4() {
        Interval in1 = new Interval(1, 4);
        Interval in2 = new Interval(4, 5);
        Interval in3 = new Interval(4, 6);

        Interval[] intervals = {in1, in2, in3};

        System.out.println(room2.solve(intervals));
    }

    @Test
    public void solve5() {
        Interval in1 = new Interval(1, 4);
        Interval in2 = new Interval(4, 5);
        Interval in3 = new Interval(4, 6);
        Interval in4 = new Interval(6, 8);
        Interval in5 = new Interval(8, 10);
        Interval in6 = new Interval(9, 11);


        Interval[] intervals = {in1, in2, in3,in4,in5,in6};

        System.out.println(room2.solve(intervals));
    }
}