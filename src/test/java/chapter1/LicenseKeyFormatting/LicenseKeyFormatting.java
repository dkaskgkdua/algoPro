package chapter1.LicenseKeyFormatting;

import java.util.Locale;

public class LicenseKeyFormatting {
    // 나
    public static String solve(String str, int k) {

        String replace = str.replace("-", "");
        replace = replace.toUpperCase();

        StringBuilder sb =new StringBuilder(replace);

        for(int i = sb.length()-k; i > 0 ; i= i-k) {
            sb.insert(i, '-');
        }
        return sb.toString();
    }
    // 강사
    public static String solve2(String str, int k) {
        String newStr = str.replace("-", "");
        newStr = newStr.toUpperCase();
        int leng = newStr.length();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <leng; i++) {
            sb.append(newStr.charAt(i));
        }
        for(int i=k; i<leng; i= i+k) {
            sb.insert(leng-i,"-");
        }
        return sb.toString();
    }
}
