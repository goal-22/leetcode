package com.goal.search;

public class Offer04 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
//      从左下角开始比较
        int i = matrix.length - 1,j = 0;
//      将整个二维数组比较完还没找到,即该数组没有这个值
        while (i >= 0 && j < matrix[0].length){
//          如果 target 大于当前值,则该列都没有比 target 大的值了
//          可以消除本列
            if (target > matrix[i][j]){
                j ++;
//          同理,如果 target 小于当前值,则该行没有比 target 小的值了
//          可以消除本行
            } else if (target < matrix[i][j]){
                i --;
            } else {
                return true;
            }
        }
//      遍历完整个数组没有找到就返回 false
        return false;
    }

    public static void main(String[] args) {

    }
}
