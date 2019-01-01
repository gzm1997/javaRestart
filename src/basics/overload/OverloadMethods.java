package basics.overload;

/*方法的重载只允许参数不一样 其他：
* 1.访问控制符
* 2.方法名称
* 都必须一模一样
*
*
*
* 总而言之 重载就是参数不一样而已 只能是参数不一样！！！！！！！*/

public class OverloadMethods {
    public void overloadTest() {
        System.out.println("这是测试函数");
    }
    public void overloadTest(int num) {
        System.out.println("这是重载的函数内部 传进来的参数为" + num);
    }
    public static void main(String[] args) {
        OverloadMethods overloadMethods = new OverloadMethods();
        overloadMethods.overloadTest();
        overloadMethods.overloadTest(12);
    }
}
