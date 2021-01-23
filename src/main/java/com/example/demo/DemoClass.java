package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author mengzz
 **/
public class DemoClass {
    public static void main(String[] args) {
        String str = "1";
        List<String> list = Stream.of(str).collect(Collectors.toList());
        String[] array = {str};
        list.toArray(new String[0]);
    }
}
