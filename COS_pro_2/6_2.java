    public int solution(int[] papers, int K) {
        
        int length = papers.length;
        for(int i = 0; i < length; i++){
        	K -= papers[i];
        	if(K < 0)
        		length = i;
        }
        return length;
    }
