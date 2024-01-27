class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] str1ar = str1.toCharArray();
        char[] str2ar = str2.toCharArray();
        for (int ndx=0; ndx<str1ar.length; ndx++) {
        	answer += str1ar[ndx];
        	answer += str2ar[ndx];
        }
        return answer;
    }
}