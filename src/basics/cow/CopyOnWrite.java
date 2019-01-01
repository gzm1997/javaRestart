package basics.cow;

import java.util.concurrent.CopyOnWriteArrayList;


/*下面我们使用了COW家族的一员 就是copy on write机制
*
*
* 这个机制适合使用在读多写极少的高并发场景下
*
* 因为他的原理就是：实行读写分离 如果是写操作 则复制一个新集合 在新集合中添加和删除元素 待一切修改完成之后 再将原集合的引用指向新的集合 这样做的好处就是可以高并发地对COW进行读和遍历操作 而不需要加锁 因为当前集合不会添加任何元素
*
*
* 使用注意要点：
* 1. 尽量设置合理的容量初始值 因为会设置扩容的问题
* 2. 使用批量添加或删除的方法 因为每一次修改都是需要copy出一份新的集合出来的 如果分开修改 那么代价很大
*
*
* 有点和缺点：
* 优点：是线程安全的
* 缺点：不能读取到最新的数据*/
public class CopyOnWrite {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Long> list = new CopyOnWriteArrayList<Long>();
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            list.add(System.nanoTime());
        }
        long end = System.nanoTime();
        System.out.println("cost time " + (end - start));
    }
}
