package chapter1.MeetingRoom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeetingRoomTest {
    MeetingRoom room;

    @Before
    public void setUp() throws Exception {
        room = new MeetingRoom();
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
}