package programmers.level2.SkillTree;

public class SkillTree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String tree : skill_trees) {
            // char 쪼갬
            char[] treeCharArray = tree.toCharArray();
            // break 및 카운트 체크용
            boolean skillCheck = true;

            // 체크대상 스킬트리에서 최초스킬부터 어떤 스킬이 선행되어야 하는지 체크
            // 에를 들어 "BACDE" 면 B부터 "CBD"에서 체크하면 C가 선행되어야 함
            for(Character treeChar : treeCharArray) {
                // 필요한 모든 선행스킬을 탐색
                for(int i = skill.indexOf(treeChar)-1; i >= 0; i--) {
                    char needSkill = skill.charAt(i);
                    // 스킬트리에서 선행되어야 하는 스킬이 기준스킬보다 뒤에 있거나 없으면 불만족 스킬트리임
                    if(tree.indexOf(needSkill) > tree.indexOf(treeChar)
                        || !tree.contains(String.valueOf(needSkill))) {
                        skillCheck = false;
                        break;
                    }
                }
                // 성능향상을 위해 불필요한 체크는 안함
                if(!skillCheck) {
                    break;
                }
            }
            if(skillCheck) {
                answer++;
            }
        }

        return answer;
    }
}
