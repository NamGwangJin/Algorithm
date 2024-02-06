class Solution {
    public int solution(int a, int b, int c, int d) {
    	int answer = 0;
    	
        int[] counts = new int[7]; // 주사위 눈의 개수를 세기 위한 배열 생성
        
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;
        
        int count = 0; // 주사위가 각각 1개씩일 때 카운트
        
        for (int p = 1; p <= 6; p++) {
        	
            if (counts[p] == 4) { // 4개일 때
                answer = 1111 * p;
                break;
            } else if ( counts[p] == 3 ) { // 3개일 때
            	for (int q = 1; q <= 6; q++) {
            		if ( counts[q] == 1 ) {
            			double result = Math.pow(10 * p + q, 2);
            			answer = (int) result;
            			break;
            		}
            	}
                
            	break;
            } else if ( counts[p] == 2 ) { // 2개일 때
            	for (int q = 1; q <= 6; q++) {
            		if ( counts[q] == 2 ) { // 나머지 똑같은 2개가 발견되면
            			if ( p == q ) continue;
            			answer = ( p + q ) * Math.abs( p - q );
            			break;
            		}
            		if ( counts[q] == 1 ) { // 다른 1개가 발견되면 나머지 1개를 찾으러 간다.
            			for ( int r = 1; r <= 6; r++) {
            				if ( counts[r] == 1 ) {
            					if ( r == q ) continue;
            					answer = q * r;
            					break;
            				}
            			}
            			if ( answer != 0 ) break;
            		}
            	}
            	break;
            } else if ( counts[p] == 1 ) { // 1개일 때
            	count++;
            	
            	if ( count == 4 ) {
	                for (int minNum = 1; minNum <= 6; minNum++) { // 가장 작은 수 찾기
	                    if (counts[minNum] == 1) {
	                        answer = minNum;
	                        break;
	                    }
	                }
            	} 
            	else continue;

            }
            
        }
        
        return answer;
    }
}