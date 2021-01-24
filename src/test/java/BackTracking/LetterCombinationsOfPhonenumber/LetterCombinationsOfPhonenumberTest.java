package BackTracking.LetterCombinationsOfPhonenumber;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsOfPhonenumberTest {

    @Test
    public void solve() {
        //given
        String digit = "23";
        String[] digitletter = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", ""};

        //when
        List<String> solve = LetterCombinationsOfPhonenumber.solve(digit, digitletter);

        //then

    }
}