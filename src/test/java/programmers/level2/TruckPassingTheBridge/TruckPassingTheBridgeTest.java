package programmers.level2.TruckPassingTheBridge;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruckPassingTheBridgeTest {

    @Test
    public void solution() {
        //given
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        //when
        TruckPassingTheBridge test = new TruckPassingTheBridge();
        int result = test.solution(bridge_length, weight, truck_weights);

        //then
        Assert.assertEquals(8, result);
    }
    @Test
    public void solution2() {
        //given
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};

        //when
        TruckPassingTheBridge test = new TruckPassingTheBridge();
        int result = test.solution(bridge_length, weight, truck_weights);

        //then
        Assert.assertEquals(101, result);
    }
    @Test
    public void solution3() {
        //given
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        //when
        TruckPassingTheBridge test = new TruckPassingTheBridge();
        int result = test.solution(bridge_length, weight, truck_weights);

        //then
        Assert.assertEquals(110, result);
    }
}