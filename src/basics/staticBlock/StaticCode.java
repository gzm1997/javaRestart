package basics.staticBlock;

public class StaticCode {
    static String prior = "done";

    /*根据输出结果来看 static无论是静态变量还是静态代码块(除了静态方法)
    * 都是按照先后顺序来执行的 比如下面的静态变量先进行初始化 再执行下面的静态代码块*/
    static String last = f() ? g() : prior;

    public static boolean f() {
        System.out.println("这是f函数");
        return true;
    }

    public static String g() {
        System.out.println("这是g函数");
        return "lala";
    }

    static {
        System.out.println("这是静态代码块");
        System.out.println(last);
        g();
    }
    public static void main(String[] args) {

    }
}
