package com.goal.dp;

public class Offer47 {

    public static int maxValue(int[][] grid) {

        /**
         思路:
         要找到右下角礼物的最大值,需要找到前一个礼物的最大值
         到达当前礼物的路径只有两个,左边或者上面
         只需要比较左边和上面的值哪个大,比较出的结果加上当前礼物的值即可
         */

        // 获取行列的长度
        int r = grid.length, c = grid[0].length;
        // 状态转移方程
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && j == 0) {
                    // 如果grid[i][j]处于左上角,那么礼物最大值就是本身
                    continue;
                } else if (i == 0) {
                    // 如果grid[i][j]处于第一行,那么礼物最大值就是 grid[i][j] + grid[i][j - 1]
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    // 如果grid[i][j]处于第一列,那么礼物最大值就是 grid[i][j] + grid[i - 1][j]
                    grid[i][j] += grid[i - 1][j];
                } else {
                    // 其他情况,礼物最大值就是 grid[i][j] + max(grid[i][j - 1],grid[i - 1][j])
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[r - 1][c - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(maxValue(grid));
    }

}
