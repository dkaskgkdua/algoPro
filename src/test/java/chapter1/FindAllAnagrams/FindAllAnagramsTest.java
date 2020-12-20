package chapter1.FindAllAnagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindAllAnagramsTest {
    @Test
    public void test() {
        String txt = "BACDGABCDA";
        String pat = "ABCD";

        Assert.assertEquals(FindAllAnagrams.findAnagrams(txt, pat), Arrays.asList(0,5,6));
    }

}