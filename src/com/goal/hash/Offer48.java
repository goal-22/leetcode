package com.goal.hash;

import java.util.HashSet;
import java.util.Set;

public class Offer48 {

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        if (s.length() < 1){
            return res;
        }
        char[] chars = s.toCharArray();
        //  set 用于存储整个字符串中每个字符的存在情况
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            //  如果集合中没有该字符,则将该字符添加到集合中
            if (! set.contains(c)){
                set.add(c);
                res = Math.max(res,set.size());
            } else {
            //  如果集合中有该字符,则将集合清空
                set.clear();
                set.add(c);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

}
