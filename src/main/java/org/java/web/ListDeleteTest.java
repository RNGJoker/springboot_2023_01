package org.java.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Joker
 * @createTime: 2023-02-27 17:02
 */
public class ListDeleteTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李白");
        list.add("赵云");
        //list.add(null);

        System.out.println("删除前\t" + list);
        /*list.forEach(info -> {
            System.out.println(info);
        });*/

        //方式一：倒序for循环删除
        /*for (int i = list.size() - 1; i > 0; i--) {
            String str = list.get(i);
            if (str.startsWith("李")) {
                list.remove(i);
            }
        }
        System.out.println(list);*/

        //方式二：迭代器删除
        /*List<String> infoList = new ArrayList<>(list);
        for (Iterator<String> iterator = infoList.iterator(); iterator.hasNext(); ) {
            String str = iterator.next();
            if (str.contains("李")) {
                iterator.remove();
            }
        }
        System.out.println("删除后\t" + list);*/

        List<String> stringList = new ArrayList<>(list);
        stringList = stringList.stream().filter(e -> !e.startsWith("李")).collect(Collectors.toList());
        System.out.println("删除后\t" + stringList);
    }
}
