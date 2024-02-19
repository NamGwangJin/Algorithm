class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String zero_to_s = my_string.substring(0, s);
        
        String e_to_end = my_string.substring(e+1, my_string.length());
        
        String s_to_e = my_string.substring(s, e+1);
        
        String reverse = "";
        
        for ( int i=s_to_e.length(); i >= 0; i-- ) {
        	
        	if (i == s_to_e.length()) {
        		reverse += s_to_e.substring(i);
                continue;
        	}
        	
        	reverse += s_to_e.substring(i, i+1);
        }
        
        answer = zero_to_s + reverse + e_to_end;
        
        return answer;
    }
}