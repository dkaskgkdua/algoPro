package programmers.level1.신고결과받기;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        List<Human> list = new ArrayList<>();
        for(int i = 0; i < id_list.length; i++) {
            Human temp = new Human(id_list[i]);
            list.add(temp);
        }

        for(int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            boolean check1 = false;
            boolean check2 = false;
            for(int j = 0; j < list.size(); j++) {
                Human human = list.get(j);
                // 내가 신고한 사람
                if(human.getName().equals(temp[0])) {
                    human.addReport(temp[1]);
                    check1 = true;
                }
                // 나를 신고한 사람
                if(human.getName().equals(temp[1])) {
                    human.addReported(temp[0]);
                    check2 = true;
                }
                if(check1 && check2) break;
            }
        }
        // 블럭 대상 체크
        List<String> blocked = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getReportedSize() >= k) {
                blocked.add(list.get(i).getName());
            }
        }

        // 내가 신고한 대상이 블럭 되었는지 체크 후 반환값에 넣어줌
        for(int i = 0; i < list.size(); i++) {
            answer[i] = 0;
            Human human = list.get(i);
            Set<String> reportList = human.getReportList();
            for(int j = 0; j < blocked.size(); j++) {
                // 내가 신고한 대상에 블럭된 대상이 있을 경우
                if(reportList.contains(blocked.get(j))) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    class Human {
        private String name;
        private Set<String> reportedList = new HashSet<>(); // 나를 신고
        private Set<String> reportList = new HashSet<>(); // 내가 신고

        public Human(String name) {
            this.name = name;
        }

        public void addReported(String report) {
            reportedList.add(report);
        }

        public void addReport(String report) {
            reportList.add(report);
        }

        public boolean checkExistsReport(String name) {
            return reportList.contains(name);
        }

        public String getName() {
            return name;
        }

        public Set<String> getReportList() {
            return reportList;
        }

        public int getReportedSize() {
            return reportedList.size();
        }

    }
}
