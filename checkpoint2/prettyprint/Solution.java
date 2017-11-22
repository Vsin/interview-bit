public class Solution {
    
    static final int RIGHT = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int UP = 3;
	public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }
        
        int n = 2 * A - 1;
        int[][] matrix = new int[n][n];

        int i = 0;
        int j = 0;
        int dir = 0;
        for (int num = A; num > 0; num--) {

            int size = 0;
            if (num == 1) {
                size = 1;
            } else {
                size = 8 * num - 8;
            }
            int count = 0;
            while (count < size) {

                count++;
                matrix[i][j] = num;
                if (dir == RIGHT) {
                    j++;
                    if (j == n || matrix[i][j] != 0) {
                        dir = DOWN;
                        j--;
                        i++;
                    }
                } else if (dir == DOWN) {
                    i++;
                    if (i == n || matrix[i][j] != 0) {
                        dir = LEFT;
                        i--;
                        j--;
                    }
                } else if (dir == LEFT) {
                    j--;
                    if (j < 0 || matrix[i][j] != 0) {
                        dir = UP;
                        j++;
                        i--;
                    }
                } else {
                    i--;
                    if (i < 0 || matrix[i][j] != 0) {
                        dir = RIGHT;
                        i++;
                        j++;
                    }
                }
            }
        }

        for (int p = 0; p < n; p++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int q = 0; q < n; q++) {
                list.add(matrix[p][q]);
            }
            result.add(list);
        }

        return result;
    }
}
