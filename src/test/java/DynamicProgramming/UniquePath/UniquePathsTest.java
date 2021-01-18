package DynamicProgramming.UniquePath;

import DynamicProgramming.UniquePath.UniquePaths;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    @Test
    public void uniquePaths() {
        //given
        int m = 7 , n = 3;

        //when
        int paths = UniquePaths.uniquePaths(m, n);

        //then
        assertEquals(28, paths);
    }
}