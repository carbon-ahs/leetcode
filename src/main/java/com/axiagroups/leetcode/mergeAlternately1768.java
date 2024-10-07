package com.axiagroups.leetcode;

public class mergeAlternately1768 {
    public static String mergeAlternately1768(String word1, String word2) {

        String outputString = "";
        if (word1.length() > word2.length()) {
            outputString = merge(word1.substring(0, word2.length()), word2);
            outputString = outputString + word1.substring(word2.length());
        } else if (word1.length() < word2.length()) {
            outputString = merge(word1, word2.substring(0, word1.length()));
            outputString = outputString + word2.substring(word1.length());
        } else {
            outputString = merge(word1, word2);
        }

        return outputString;
    }
    public static String merge(String word1, String word2) {
        String outputString = "";
        for (int i = 0; i < word1.length(); i++) {
            outputString = outputString + word1.charAt(i);
            outputString = outputString + word2.charAt(i);
        }
        return outputString;
    }
}
