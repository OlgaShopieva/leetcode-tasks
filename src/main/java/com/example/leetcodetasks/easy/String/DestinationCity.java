package com.example.leetcodetasks.easy.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going
 * from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 * Example 1:
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 * Example 2:
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are:
 * "D" -> "B" -> "C" -> "A".
 * "B" -> "C" -> "A".
 * "C" -> "A".
 * "A".
 * Clearly the destination city is "A".
 * Example 3:
 * Input: paths = [["A","Z"]]
 * Output: "Z"
 */
public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(List.of("London","New York"));
        paths.add(List.of("New York","Lima"));
        paths.add(List.of("Lima","Sao Paulo"));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> innerList : paths) {
            set.add(innerList.get(0));
        }
        for (List<String> innerList : paths) {
            if(!set.contains(innerList.get(1))) {
                return innerList.get(1);
            }
        }
        return "";
    }
}
