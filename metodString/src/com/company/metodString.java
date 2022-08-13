package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class metodString {

    public void lastElement(@NotNull String str) {
        System.out.println("Последний элемент строки - " + str.charAt(str.lastIndexOf("!")));
    }

    public void endsWith(@NotNull String str){
        System.out.println("Строка содержит в окончании '!!!' - " + str.endsWith("!!!"));
    }

    public void startWith(@NotNull String str){
        System.out.println("Строка содержит в начале 'I like' - " + str.startsWith("I like"));
    }

    public void contain(@NotNull String str){
        System.out.println("Строка содержит 'Java' - " + str.contains("Java"));
    }
    public void position(@NotNull String str) {
        System.out.println("Позиция построки 'Java' в строке - " + str.indexOf("Java"));
    }

    public void replace(@NotNull String str){
        System.out.println(str.replace('a', 'o'));
    }

    public void toUpperCase(String str){
        System.out.println(str.toUpperCase());
    }

    public void toLowerCase(String str){
        System.out.println(str.toLowerCase());
    }

    public void subString (String str){
        System.out.println(str.substring(str.indexOf("Java"),str.indexOf("!")));
    }
}

