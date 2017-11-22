public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	    for (int i = 0; i < a.size(); ++i) {
	        pq.add(a.get(i));
	    }
	    
	    int n = k;
	    int result = -1;
	    while (n > 0) {
	        result = pq.poll();
	        n--;
	    }
	    return result;
	}
}

