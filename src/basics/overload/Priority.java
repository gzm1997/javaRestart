package basics.overload;


/*
* 方法重载的注意要点已经写在OverloadMethods这个类里面 这里记录一下重载方法匹配的优先级
*
*
* 匹配优先级：
* 1.精确匹配
* 2.如果是基本数据类型 自动转化为更大表示范围的基本类型
* 3.通过自动拆箱与撞线
* 4.同过子类向上转向继承路线一次匹配 就是子类优先的意思
* 5.通过可变参数匹配 可变参数匹配时最低等级的
*
*
* 要注意子类的方法也是可以重载父类的方法的*/

public class Priority {
    public void OverloadMethod(int num) {
        System.out.println("参数为int的方法");
    }
    public void OverloadMethod(Integer num) {
        System.out.println("参数为Integer的方法");
    }
    public static void main(String[] args) {
        Priority priority = new Priority();
        priority.OverloadMethod(7);
    }
}
