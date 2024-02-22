class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i += m) {
            answer += my_string.substring(i, i+m).substring(c-1, c);
        }
        
        return answer;
    }
}