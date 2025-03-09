import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row); 
            reverse(row); 
        }

        int total = 0;
        int cols = grid[0].length;

        for (int col = 0; col < cols; col++) {
            int maxDeleted = 0;
            for (int[] row : grid) {
                maxDeleted = Math.max(maxDeleted, row[col]); 
            }
            total += maxDeleted;
        }

        return total;
    }

    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
        int[][] grid2 = {{10}};

        System.out.println(sol.deleteGreatestValue(grid1)); 
        System.out.println(sol.deleteGreatestValue(grid2)); 
    }
}

