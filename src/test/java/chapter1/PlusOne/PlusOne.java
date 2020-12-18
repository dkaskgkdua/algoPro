package chapter1.PlusOne;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        // 1. data structure
        int index = digits.length - 1;
        int carry = 1;
        // 2. for, while
        while(index >=0 && carry > 0) {
            // 나머지를 기준으로 carry 정함
            digits[index] = (digits[index]+1 ) % 10;
            if(digits[index] == 0) {
                carry = 1;
            } else {
                carry = 0;
            }
            --index;
        }
        // {9, 9, 9,} 일 경우 1 더해주면 {1, 0, 0, 0} 이 됨
        if(carry == 1) {
            digits = new int[digits.length+1]; // {0,0,0,0}
            digits[0] = 1;
        }
        return digits;
    }
}
