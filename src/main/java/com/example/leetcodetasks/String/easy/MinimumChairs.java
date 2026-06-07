package com.example.leetcodetasks.String.easy;

/**
 * You are given a string s. Simulate events at each second i:
 * If s[i] == 'E', a person enters the waiting room and takes one of the chairs in it.
 * If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
 * Return the minimum number of chairs needed so that a chair is available for every person who enters the waiting room
 * given that it is initially empty.
 * Example 1:
 * Input: s = "EEEEEEE"
 * Output: 7
 * Explanation:
 * After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.
 * Example 2:
 * Input: s = "ELELEEL"
 * Output: 2
 * Explanation:
 * Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room
 * at each second.
 * Second	Event	People in the Waiting Room	Available Chairs
 * 0	    Enter	1	                        1
 * 1	    Leave	0	                        2
 * 2	    Enter	1	                        1
 * 3	    Leave	0	                        2
 * 4	    Enter	1	                        1
 * 5	    Enter	2	                        0
 * 6	    Leave	1	                        1
 */
public class MinimumChairs {

    public static void main(String[] args) {
        String s = "ELELEEL";
        System.out.println(minimumChairs(s));
    }


    public static int minimumChairs(String s) {
        int peopleInRoom = 0;
        int maxPeople = 0;
        for(char ch: s.toCharArray()) {
            if (ch == 'E') {
                peopleInRoom++;
            } else {
                peopleInRoom--;
            }
            if(peopleInRoom > maxPeople) {
                maxPeople = peopleInRoom;
            }
        }
        return maxPeople;
    }
}
