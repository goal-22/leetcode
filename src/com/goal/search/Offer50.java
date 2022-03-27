package com.goal.search;

import java.util.HashMap;

public class Offer50 {

    public static char firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
//        遍历所有字符，把map里不存在的添加进去，并且将值设置为 1
//        已经存在的字符，将值设置为 value + 1
        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
//        再次遍历取第一个值为 1 的字符
        for (char c : chars) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static char firstUniqChar1(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
//        遍历所有字符，把map里不存在的添加进去，并且将值设置为 1
//        已经存在的字符，将值设置为 value + 1
        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, true);
            }else{
                map.put(c, false);
            }
        }
//        再次遍历取第一个值为 1 的字符
        for (char c : chars) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "asdfbzsdfasdf";
        System.out.println(firstUniqChar1(s));
    }
}
