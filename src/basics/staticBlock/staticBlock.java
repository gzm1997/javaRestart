package basics.staticBlock;


/*
* 我们静态static变量都是被共享的 在类初始化的时候执行 具有很高的优先级 想想被其他共享 肯定是需要最早进行执行或者初始化的
*
* static{...}这样的就是静态代码块 也是跟静态变量一样*/

class Parent {
    /*所有的静态代码块的优先级都是很高的 在类初始化执行*/
    static {
        System.out.println("这是父类的静态代码块");
    }
    public Parent() {
        System.out.println("这是父类的构造函数");
    }
}

class Son extends Parent {
    /*所有的静态代码块的优先级都是很高的 在类初始化执行*/
    static {
        System.out.println("这是子类的静态代码块");
    }
    public Son() {
        System.out.println("这是子类的构造函数");
    }


    /*静态方法中不能使用可以被修改的对象 否则会出现线程安全问题*/
    public static void TestStaticFunc() {
        System.out.println("这是静态方法");
    }
}

public class staticBlock {
    public static void main(String[] args) {
        new Son();
        /*静态代码块因为是共享的 所以只被执行一次 在上面那条语句中已经被执行了 所以下面的new语句中不会被执行了*/
        new Son();
        Son.TestStaticFunc();
    }
}
