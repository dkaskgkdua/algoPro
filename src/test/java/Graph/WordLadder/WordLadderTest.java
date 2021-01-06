package Graph.WordLadder;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordLadderTest {

    @Test
    public void ladderLength_neighbor() {
        //given
        String[] words = {"hot", "dot", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);
        //when
        int result = WordLadder.ladderLength_neighbor("hit", "cog", wordList);

        //then
        assertEquals(5, result);
    }
}