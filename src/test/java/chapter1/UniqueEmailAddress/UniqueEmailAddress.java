package chapter1.UniqueEmailAddress;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public static int numUniqueEmials(String[] emails) {
        // 1. Set은 중복값이 안되니까 set활용함
        Set<String> set = new HashSet<String>();

        // 2
        for(String email : emails) {
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);
            set.add(localName+"@"+domainName);
        }
        return set.size();
    }
    // 도메인
    public static String makeDomainName(String email) {
        return email.substring(email.indexOf('@')+1);
    }
    // 특수문자 처리
    public static String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < email.length(); i++) {
            // 1
            if(email.charAt(i) == '.') {
                continue;
            }
            if(email.charAt(i) == '+') {
                break;
            }
            if(email.charAt(i) == '@') {
                break;
            }
            // 2
            String str = String.valueOf(email.charAt(i));
            sb.append(str);
        }
        return sb.toString();
    }
}
