


public class Main {
    public static void main(String[] args) {
        /*下面这样使用valueOf来新建一哥Integer的好处在于可以使用缓存 提升程序性能*/
        Integer integer = Integer.valueOf(12);
        System.out.println("new a integer " + integer);
    }
}
