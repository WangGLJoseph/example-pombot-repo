package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "Hello, World!";
        
        // This will fail to compile because commons-lang3 is not in the dependencies
        if (StringUtils.isNotBlank(message)) {
            System.out.println("Message: " + message);
        }
        
        // Some more usage of commons-lang3 to make the dependency need obvious
        String reversed = StringUtils.reverse(message);
        System.out.println("Reversed: " + reversed);
        
        String[] words = StringUtils.split(message, " ");
        System.out.println("Word count: " + words.length);
    }
}
