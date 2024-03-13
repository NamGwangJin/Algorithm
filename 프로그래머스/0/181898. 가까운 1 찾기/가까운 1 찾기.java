class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        
        for (int i = idx ; i <= arr.length ; i++) {
            if ( i == arr.length ) {
                answer = -1;
                break;
            }
            
            if ( arr[i] == 1 ) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}