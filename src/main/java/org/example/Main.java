package org.example;

import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Hello, Maven!";
        String reversedText = StringUtils.reverse(text);
        System.out.println(reversedText);
    }
}