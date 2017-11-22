public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    result.add(new ArrayList<Integer>());
 
	    for (int i = 0; i < a.size(); i++) {
		    Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
		    for (List<Integer> list : result) {
			    for (int j = 0; j < list.size() + 1; j++) {
				    list.add(j, a.get(i));
				    ArrayList<Integer> T = new ArrayList<Integer>(list);
				    list.remove(j);
				    currentSet.add(T);
			    }
		    }
		    result = new ArrayList<ArrayList<Integer>>(currentSet);
	    }

	return result;
	    
	}
}

