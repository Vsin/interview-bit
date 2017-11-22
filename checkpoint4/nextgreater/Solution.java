public class Solution {
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    if (a.size() < 2) {
	        result.add(-1);
	        return result;
	    }
	    
	    for (int i = 0; i < a.size(); ++i) {
	        for (int j = i + 1; j < a.size(); ++j) {
	            if (a.get(j) > a.get(i)) {
	                result.add(a.get(j));
	                break;
	            }
	        }
	        if (result.size() != i + 1) {
	            result.add(-1);
	        }
	    }
	    
	    return result;
	}
}

