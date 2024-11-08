package br.com.java.datastructures.hashmap;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                List<String> ana = map.get(key);
                ana.add(s);
            } else {
                List<String> anaNew = new ArrayList<>();
                anaNew.add(s);
                map.put(key, anaNew);
            }
        }

        for (Map.Entry<String, List<String>> ana : map.entrySet()) {
            anagrams.add(ana.getValue());
        }
        return anagrams;
    }
}
