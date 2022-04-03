package com.goal.other;

/**
 * @Author: Goal
 * @Date: 2022/4/3 10:49
 */
public class Offer58 {

    /**
     * 双指针
     * @param s
     * @return
     */
    public static String reverseWords(String s) {

        String strip = s.strip();
        int j = strip.length() - 1, i = j;
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            //  找到完整的单词
            while (i >= 0 && strip.charAt(i) != ' ') i--;
            builder.append(strip.substring(i + 1, j + 1) + " ");
            //  跳过空格
            while (i >= 0 && strip.charAt(i) == ' ') i --;
            j = i;
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
    }
}
