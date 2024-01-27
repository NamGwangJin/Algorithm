class Solution {
    public int solution(int n) {
        int answer = 0;
                if (n%2!=0) {
        	while(true) {
        		answer += n;
        		n-=2;
        		if (n<1) break;
        	}
        } else {
        	while(true) {
        		answer +=n*n;
        		n-=2;
        		if (n<2) break;
        	}
        }
        return answer;
    }
}