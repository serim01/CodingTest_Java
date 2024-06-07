import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            stringList.add(string.charAt(n) + string);
        }
        Collections.sort(stringList);
        
        for(int i = 0; i < stringList.size(); i++) {
            answer[i] = stringList.get(i).substring(1);
        }

        return answer;
    }
}