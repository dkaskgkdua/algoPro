package Graph.CourseSchedule;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {

    @Test
    public void solve() {
        //given
        int[][] ex1 = {{1,0}, {0,1}};
        int[][] ex2 = {{1,0}, {2,1}, {3,2}};

        //when
        boolean solve1 = CourseSchedule.solve(ex1);
        boolean solve2 = CourseSchedule.solve(ex2);

        //then
        assertFalse(solve1);
        assertTrue(solve2);
    }
}