package com.example.leetcodetasks.easy.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color,
 * and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 * Example 1:
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
 * ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"),
                Arrays.asList("phone","gold","iphone")
        );
        String ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches(items,ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> innerList : items) {
            switch (ruleKey) {
                case "type":
                    String type = innerList.get(0);
                    if(type.equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "color":
                    String color = innerList.get(1);
                    if(color.equals(ruleValue)) {
                        count++;
                    }
                    break;
                case "name":
                    String name = innerList.get(2);
                    if(name.equals(ruleValue)) {
                        count++;
                    }
                    break;
            }
        }
        return count;
    }
}
