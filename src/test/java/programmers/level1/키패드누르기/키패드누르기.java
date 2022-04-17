package programmers.level1.키패드누르기;

public class 키패드누르기 {
    private static int[][] phone = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
    };
    public String solution(int[] numbers, String hand) {
        StringBuilder resultBuilder = new StringBuilder();
        int[] leftPosition = {3, 0};
        int[] rightPosition = {3, 2};
        boolean isLeft = hand.equals("left");

        for(int number : numbers) {
            int[] numberIndex = findNumberIndex(number);
            String useHand = findUseHand(numberIndex, leftPosition, rightPosition, isLeft);
            if(useHand.equals("L")) {
                leftPosition = numberIndex;
            } else {
                rightPosition = numberIndex;
            }
            resultBuilder.append(useHand);
        }

        return resultBuilder.toString();
    }
    // 사용할 손 찾기
    public String findUseHand(int[] numberIndex, int[] leftPosition, int[] rightPosition, boolean isLeft) {
        // 우측이면 오른손
        if(numberIndex[1] == 2) {
            return "R";
        } else if(numberIndex[1] == 0) { // 좌측이면 왼손
            return "L";
        }
        // 중간값이면 계산
        int leftMoveCount = Math.abs(numberIndex[0] - leftPosition[0]) + Math.abs(numberIndex[1] - leftPosition[1]);
        int rightMoveCount = Math.abs(numberIndex[0] - rightPosition[0]) + Math.abs(numberIndex[1] - rightPosition[1]);
        if(leftMoveCount > rightMoveCount) {
            return "R";
        } else if(leftMoveCount < rightMoveCount) {
            return "L";
        } else {
            return (isLeft) ? "L" : "R";
        }
    }
    // 번호 위치 찾기
    public int[] findNumberIndex(int number) {
        for(int row = 0; row < phone.length; row++) {
            for(int col = 0; col < phone[row].length; col++) {
                if(phone[row][col] == number) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

}
