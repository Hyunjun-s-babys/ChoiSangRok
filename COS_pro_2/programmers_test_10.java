import java.util.Arrays;

class Solution {
    public int solution(int[][] arr, int k) {
        int answer = 0;
        
        int n = arr.length;
        
        int[] onearr = new int[n * 4];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                onearr[index++] = arr[i][j];
            }
        }
        
        Arrays.sort(onearr);
        
        answer = onearr[k - 1];
        
        return answer;
    }
}
