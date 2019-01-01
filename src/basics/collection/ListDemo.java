package basics.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        /*获取list的大小*/
        System.out.println("size of ArrayList is " + arrayList.size());

        /*遍历这个ArrayList 有三种方式*/

        /*下标遍历 这是最快的一种方式*/
        for (int i = 0; i < arrayList.size(); i++) {
            /*使用下标定位数组元素的时候 只可以使用get函数定位*/
            System.out.println(arrayList.get(i));
        }

        /*for循环遍历*/
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        /*使用迭代器进行遍历*/
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
