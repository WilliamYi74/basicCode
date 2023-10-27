package com.yunwuyun.treeset;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        // 按照age自然排序 如果age相等则根据name字典排序
//        compare1();
//        compare2();
    }

    /**
     * @description 自定义Comparator接口实现排序
     */
    private static void compare2() {
        TreeSet<Person> ts = new TreeSet<>((Person p1, Person p2) -> {
            int result = p1.getAge() - p2.getAge();
            return result == 0 ? p1.getWeight() - p2.getWeight() : result;
        });
        ts.add(new Person(17, 110));
        ts.add(new Person(18, 130));
        ts.add(new Person(19, 120));
        ts.add(new Person(19, 118));
        System.out.println(ts);
    }
    /**
     * @description 实体实现Comparable接口重写compareTo方法实现排序
     */
    private static void compare1() {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("c", 17));
        ts.add(new Student("a", 19));
        ts.add(new Student("f", 18));
        ts.add(new Student("b", 18));
        System.out.println(ts);
    }
}
