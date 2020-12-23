package chapter1.GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // 1.
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();

        // 2.
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            // string 을 char 배열로 변환 후 정렬시킴.
            Arrays.sort(charArray);
            // 그리고 이것을 키로 사용함
            String key = String.valueOf(charArray);

            // 해당 키가 있으면 String List에 값을 넣는다.
            if(map.containsKey(key)) {
                map.get(key).add(str);
                System.out.println("기존 거에 key :" + key+ " / value :" + str);
            } else { // 아니면 키 새로 만들어서 넣어주고
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
                System.out.println("새로운 key :" + key+ " / value :" + str);
            }

        }
        // 마지막 결과값에 담아서 반환
        result.addAll(map.values());

        return result;
    }
}
