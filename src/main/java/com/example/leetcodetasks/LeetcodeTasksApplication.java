package com.example.leetcodetasks;

import com.example.leetcodetasks.easy.Arrays.MaxConsecutiveOnes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeTasksApplication.class, args);
        int[] array = {1, 0, 1, 1, 1, 0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        maxConsecutiveOnes.findMaxConsecutiveOnes(array);
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(array));
    }

}
