public class Solution {
	public int numRange(ArrayList<Integer> a, int b, int c) {
	    
	    int result = 0;
	    for (int i = 0; i < a.size(); ++i) {
	        int current = 0;
	        int j = i;
	        while (current <= c && j < a.size()) {
	            current += a.get(j);
	            if (current >= b && current <= c) {
	                result += 1;
	            }
	            j++;
	        }
	    }
	    return result;
	}
}

