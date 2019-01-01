public class OuterClass {

//    成员内部类
    private class InstanceInnerClass {}

//    静态内部类
    static class StaticInnerClass {
        public static void main(String[] args) {
            System.out.println("lala");
        }
    }

    public static void main(String[] args) {
//        两个匿名内部类
        (new Thread() {}).start();
        (new Thread() {}).start();

//        两个方法内部类
        class MethodClass1 {}
        class MethodClass2 {}
    }
}
