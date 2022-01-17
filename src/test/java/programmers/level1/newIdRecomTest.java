package programmers.level1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class newIdRecomTest {

    @Test
    public void solution() {
        newIdRecom newIdRecom = new newIdRecom();
        Assert.assertEquals("bat.y.abcdefghi", newIdRecom.solution("...!@BaT#*..y.abcdefghijklm"));
        Assert.assertEquals("z--", newIdRecom.solution("z-+.^."));
        Assert.assertEquals("aaa", newIdRecom.solution("=.="));
        Assert.assertEquals("123_.def", newIdRecom.solution("123_.def"));
        Assert.assertEquals("abcdefghijklmn", newIdRecom.solution("abcdefghijklmn.p"));
        Assert.assertEquals("-_._-", newIdRecom.solution("-_.~!@#$%^&*()=+[{]}:?,<>/._-"));
        Assert.assertEquals("-_._-", newIdRecom.solution("-_..~!@#$%^&*()=+[{]}:?,<>/._-"));
        Assert.assertEquals("qqq", newIdRecom.solution("..q"));
        Assert.assertEquals("abcd", newIdRecom.solution("./././././abcd/././././."));
        Assert.assertEquals("aaa", newIdRecom.solution("......................"));
        Assert.assertEquals("sfgsgsg", newIdRecom.solution(".sfgsgsg."));
        Assert.assertEquals("aaaaaaaaaaaaaaa", newIdRecom.solution("aaaaaaaaaaaaaaaa"));
    }
}