package basics.mapUsage;

import java.util.TreeMap;

class Key implements Comparable<Key> {
    @Override
    public int compareTo(Key o) {
        return 1;
    }
}

/*treeMap一般都是在key需要排序的情况下使用 这样效率很高 但是一般用的很少 因为conncurrentHashMap跟HashMap在插入和删除方面效率很高 后两者用地比较多
*
*
    * 但是我们要注意 TreeMap的key排序去重并不是基于key元素覆写hashcode函数跟equal函数的 而是实现了接口comparable 覆写了compareTo函数*/

public class TreeMapUsage {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new Key(), "value one");
        treeMap.put(new Key(), "value two");
        System.out.println(treeMap.size());
        TreeMap treeMap1 = new TreeMap();
        treeMap1.put(1, "one");
        /*map的key是有类型 即使一开始你没有显示指定类型 但是第一次添加之后key的类型就已经固定了 后面不允许添加其他类型*/
        /*所以下面这一句会报错*/
//        treeMap1.put("2", "two");
        /*但是下面这一句没有报错 说明value是不限定类型的*/
        treeMap1.put(2, 3);
        System.out.println(treeMap1.size());
    }
}
