package DynamicProgramming.CoinChange;

import DynamicProgramming.CoinChange.CoinChange;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    @Test
    public void coinChange() {
        //given
        int[] coins = {1, 2, 5};
        int amount = 11;

        //when
        int coinChange = CoinChange.coinChange(coins, amount);

        //then
        assertEquals(3, coinChange);
    }
}