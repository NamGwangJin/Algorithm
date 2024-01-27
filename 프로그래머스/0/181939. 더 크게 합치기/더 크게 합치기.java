class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = a+"";
        String b1 = b+"";
        String ab = a1+b1;
        String ba = b1+a1;
        if (Integer.parseInt(ab)>Integer.parseInt(ba)) {
        	answer = Integer.parseInt(ab);
        } else {
        	answer = Integer.parseInt(ba);
        }
        return answer;
    }
}