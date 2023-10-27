package com.yunwuyun.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if(it.next() == "1") {
                it.remove();
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if("1".equals(s)) {
//                list.remove(s);
//            }
//        }
        System.out.println(list);
    }
}
