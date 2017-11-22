public class Solution {
	public int longestConsecutive(final List<Integer> a) {
        if (a == null || a.size() == 0) return 0;
    
        Set<Integer> set = new HashSet<Integer>(a);
    
        int max = 0;
        for (int num : a) {
            if (set.remove(num)) {
                int val = num;
                int sum = 1;
                while (set.remove(val - 1)) {
                    val--;
                }
                sum += num - val;
            
                val = num;
                while (set.remove(val + 1)) {
                    val++;
                }
                sum += val - num;
            
                max = Math.max(max, sum);
            }
        }
        return max;
	  
	}
}

