package basics.parameters;



/*
 * 看了书本才知道 原来java的先可以分为：
 * 1.基本数据类型
 * 2.引用变量 引用变量就是相当于指针了
 * 基本数据类型作为函数参数传入是无法被修改的 引用变量作为函数参数传入可以
 *
 * 除此之外 根据可是否可以被修改 也可以分为两种类型：
 * 1.immutable不可修改 比如int跟string
 * 2.mutable可修改 比如 StringBuilder
 * 两种，不可修改就是当这个类型的参数传入函数中之后 函数中的任何操作都对这个参数不产生实质上的作用*/

public class immutable {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("old");
        change(str, str);
        System.out.println(str);

        String string = new String("lala");
        changeStr(string);
        System.out.println("after changestr " + string);

        int num = 100;
        changeInt(num);
        System.out.println("after changeInt " + num);
    }

    /*测试修改StringBuilder的函数
    *
    * StringBuilder传进来本身是引用变量 是可以被修改的 穿进去之后又因为他本身是mutable的 所以被修改成功*/
    public static void change(StringBuilder str0, StringBuilder str1) {
        str0.append("append0");
        str1.append("append1");

        str0 = new StringBuilder("new string builder");
        str0.append("new append");
        System.out.println("inside func " + str0);
    }

    /*测试修改string的函数
    *
    * String传进来的引用变量 所以一开始是可以被修改的 但是因为String是immutable的 所以即使引用变量穿进去之后最后也是修改失败*/
    public static void changeStr(String str) {
//        string类型的参数 修改效果都是修改了参数的局部变量
        str = "change str ";
        System.out.println("str inside func " + str);
    }

    /*测试修改int类型的函数
    *
    * int这里是作为基本数据类型传进去的 所以本身就不可以被修改 无论是传进去之后是mutable还是immutable的*/
    public static void changeInt(int num) {
//        int类型的参数 修改效果都是修改了参数的局部变量
        num = 10;
        System.out.println("inside func" + num);
    }
}

