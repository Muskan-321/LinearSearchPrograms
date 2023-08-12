public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{3, 2, 1},
                {4, 5, 1},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int row, col, sum = 0;
        int ans = Integer.MIN_VALUE;
        for (row = 0; row < accounts.length; row++) {
            for (col = 0; col < accounts.length; col++) {
                sum += accounts[row][col];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
