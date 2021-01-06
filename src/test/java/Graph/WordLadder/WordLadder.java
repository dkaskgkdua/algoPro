package Graph.WordLadder;

import java.util.*;

/**
 *  특정 문자열로 시작해서
 *  특정 문자열중 각 문자를 변경한게 이웃이 될 수 있음.
 *
 *  각 문자를 변경하다가 연결되는 이웃은 마지막 값으로 주어진 값까지
 *  몇 단계에 걸쳐서 가는지?
 *  ex) "hot", "dot", "lot", "log", "cog"
 *    start = "hit" , end = "cog"
 *    결과 : "hit" - "hot" - "dot" - "dog" - "cog"
 *        총 5단계임임
*/
public class WordLadder {
    public static int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
        // 빈값 체크
        if(wordList == null || !wordList.contains(endWord)) {
            return 0;
        }
        // BFS로 접근 - Queue
        Queue<String> queue = new LinkedList<>();
        // 중복 제외하기 위해 set에 세팅
        Set<String> dict = new HashSet<>(wordList);

        // 초기 세팅
        queue.offer(beginWord);
        dict.add(endWord);
        dict.remove(beginWord);
        int level = 1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                // 큐에서 뽑은 단어가 끝단어와 일치할 경우 결과 반환
                String str = queue.poll();
                if(str.equals(endWord)) {
                    return level;
                }
                // 바뀐 한단어가 같은 값들을 불러옴(이웃들) 그리고 queue에 다시 넣음
                List<String> neighbors = neighbors(str, wordList);
                for(String neighbor : neighbors) {
                    queue.offer(neighbor);
                }
            }
            level++;
        }
        return level;
    }

    public static List<String> neighbors(String s, List<String> wordList) {
        List<String> res = new LinkedList<>();
        Set<String> dict = new HashSet<>(wordList);
        // 단어별 a~z까지 반복문 돌려서 같은 값이 나오면 결과에 담음
        for(int i = 0; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            for(char ch = 'a'; ch <= 'z'; ch++) {
                chars[i] = ch; // hit -> (ait ~ zit), (hat ~ hzt), (hia ~ hiz)
                String word = new String(chars);
                if(dict.remove(word)) {
                    res.add(word);
                }
            }
        }
        return res;
    }
}
