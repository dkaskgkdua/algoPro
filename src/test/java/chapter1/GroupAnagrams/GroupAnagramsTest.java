package chapter1.GroupAnagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> listGroup = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("ate");
        list1.add("eat");
        list1.add("tea");
        List<String> list2 = new ArrayList<>();
        list2.add("nat");
        list2.add("tan");
        List<String> list3 = new ArrayList<>();
        list3.add("bat");
        listGroup.add(list1);
        listGroup.add(list3);
        listGroup.add(list2);

        //Assert.assertSame("1","2");
        Assert.assertSame(GroupAnagrams.groupAnagrams(strArr),listGroup);
    }
}