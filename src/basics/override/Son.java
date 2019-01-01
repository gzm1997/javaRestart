package basics.override;

class Father {
    protected void DoSomething() {
        System.out.println("这是父类函数");
    }
}

/*子类覆写的四大要求：
* 1. 子类方法中的访问权限不得小于父类中的
* 2. 子类方法的返回类型必须可以向上转型为父类的返回类型
* 3. 子类方法的异常类型必须可以向上转型为父类的异常类型
* 4. 子类方法的方法签名 参数类型以及个数必须完全一样*/

/*覆写只可以针对：
* 1. 非静态
* 2. 非final
* 3. 非构造方法
*
* 其实不可以覆写静态方法很容易理解 因为静态方法是属于类的 如果子类覆写了父类的静态方法 那么久存在两个名称相同的静态方法 两个都可以能被调用*/

public class Son extends Father {
    @Override
    public void DoSomething() {
        System.out.println("这是子类覆写的函数");
    }
    public static void main(String[] args) {
        Father father = new Son();
        father.DoSomething();
        /*像下面这样向下转型是不可以的*/
//        Son son = new Father();
    }
}
