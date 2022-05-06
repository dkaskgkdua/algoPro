package programmers.level2.SkillTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkillTreeTest {

    @Test
    public void solution() {
        //given
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        //when
        int solution = SkillTree.solution(skill, skill_trees);

        //then
        assertEquals(2, solution);
    }
}