/*
 * Given an integer matrix, find a submatrix where the sum of numbers is zero. Your code should return the coordinate of the left-up and right-down number.

Example
Given matrix

[
  [1 ,5 ,7],
  [3 ,7 ,-8],
  [4 ,-8 ,9],
]
return [(1,1), (2,2)]

Challenge 
O(n ^ 3) time.
 */
public class SubmatrixSum {

    /**
     * @param matrix an integer matrix
     * @return the coordinate of the left-up and right-down number
     */
    public int[][] submatrixSum(int[][] matrix) {
        int[][] result = new int[2][2];
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int xLen = matrix.length;
        int yLen = matrix[0].length;
        int[][] sum = new int[xLen + 1][yLen + 1];
        for (int i = 0; i < xLen; ++i) {
            for (int j = 0; j < yLen; ++j) {
                if (i == 0 && j == 0) {
                    sum[i + 1][j + 1] = matrix[i][j];
                } else if (i == 0 && j > 0) {
                    sum[i + 1][j + 1] = 
                } else if (i > 0 && j == 0) {

                } else {
                    sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j];
                }
            }
        }
        for (int i = 0; i < xLen; ++i) {
            for (int j = i; j < xLen; ++j) {
                Map<Integer, Integer> map = new HashMap<Integer, Integer>();
                for (int k = 0; k < yLen; ++k) {
                    int area = sum[j + 1][k + 1] - sum[i][k + 1];
                    if (map.containsKey(area)) {
                        result[0][0] = i + 1;
                        result[0][1] = map.get(area) + 1;
                        result[1][0] = j;
                        result[1][1] = k;
                        return result;
                    } else {
                        map.put(area, k);
                    }
                }
            }
        }
        return result;
    }

}