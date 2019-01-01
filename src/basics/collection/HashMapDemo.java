package basics.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        /*添加元素
         * 这种put方法会覆盖原有的*/
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        /*这种方法不会覆盖原有的值*/
        hashMap.putIfAbsent("a", 12);

        /*删除键值对*/
        hashMap.remove("a");
        hashMap.remove("b", 2);

        /*获取元素*/
        System.out.println(hashMap.get("c"));


        /*遍历的方法
         * 遍历看别人博客好像都只可以使用迭代器*/
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(hashMap.get(key));
        }

        System.out.println("hash code" + hashMap.hashCode());
    }
}
