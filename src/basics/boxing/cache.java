package basics.boxing;


/*除了float和double之外 其他包装数据类型都会使用缓存 六个包装类直接赋值的时候 就是调用对应包装类的静态工厂valueOf*/
/*    public static Integer valueOf(int i) {
        如果存在缓存区间里面 就用缓存的
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        如果没有就重新创建一个新的
        return new Integer(i);
    }*/
public class cache {
    public static void main(String[] args) {
        /*直接重新创建一个对象 分配内存空间*/
        Integer integer = new Integer(11);
        System.out.println("新创建的Integer类型" + integer);

        /*先查询缓存区是否存在这个值 如果存在就是用缓存中的实例 如果没有就重新new一个*/
        Integer integer1 = Integer.valueOf(11);
        System.out.println("新建的Integer类型" + integer1);
    }
}
