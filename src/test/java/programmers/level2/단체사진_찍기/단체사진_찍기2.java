package programmers.level2.단체사진_찍기;

public class 단체사진_찍기2 {
    private String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    private int answer = 0;

    public int solution(int n, String[] data) {
        boolean[] visited = new boolean[8];
        StringBuilder sb = new StringBuilder("");

        dfs(data, visited, sb);
        return answer;
    }

    public void dfs(String[] data, boolean[] visited, StringBuilder sb) {
        if(sb.length() == 8) {
            if(check(data, sb)) {
                answer += 1;
            }
            return;
        }
        // 모든 케이스 탐색
        for(int i = 0; i < friends.length; i++) {
            // 탐색 안한 곳인 경우
            if(!visited[i]) {
                visited[i] = true;
                StringBuilder nsb = new StringBuilder(sb);
                nsb.append(friends[i]);
                dfs(data, visited, nsb);
                visited[i] = false;
            }
        }
    }
    // 케이스 일치 확인
    public boolean check(String[] data, StringBuilder sb) {
        for(String value : data) {
            int targetIndex = sb.indexOf(String.valueOf(value.charAt(0)));
            int compareIndex = sb.indexOf(String.valueOf(value.charAt(2)));
            String co = String.valueOf(value.charAt(3));
            String coValue = String.valueOf(value.charAt(4));
            if(co.equals("=")) {
                if(!(Math.abs(targetIndex - compareIndex) - 1 == Integer.parseInt(coValue))) return false;
            } else if(co.equals(">")) {
                if(!(Math.abs(targetIndex - compareIndex) - 1 > Integer.parseInt(coValue))) return false;
            } else if(co.equals("<")) {
                if(!(Math.abs(targetIndex - compareIndex) - 1 < Integer.parseInt(coValue))) return false;
            }
        }
        return true;
    }
}
