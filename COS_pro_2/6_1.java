	public int solution(int[] temperature, int A, int B) {
        
		int answer = 0;
		for(int i = A; i < B; i++) {
			if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
				answer += 1;
		}
		return answer;
	}
