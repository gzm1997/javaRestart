package basics.template;

class Meat {
    @Override
    public String toString() {
        return "Meat";
    }
}
class Soup {
    @Override
    public String toString() {
        return "Soup";
    }
}

/*使用泛型的好处：
* 1. 避免使用重载写多种方法
* 2. 类型擦除 避免强制转换带来的风险
*
*
* 什么是类型擦除:
* 所有的泛型参数都相当于转换为Object类型 进去是什么 出来就是什么 避免了类型强制转换带来的风险*/


/*任何在尖括号中的指代一种未知类型 即使放String在尖括号里面 这时候的String也不再是jav.lang.String不一样了*/

public class Stove {
    /*尖括号必须位于：
    1.类名之后 或者
    2.方法返回类型之前*/
    public static <T> void heat(T food) {
        System.out.println(food + " is done");
    }

    public static void main(String[] args) {
        Meat meat = new Meat();
        Soup soup = new Soup();
        Stove.heat(meat);
        Stove.heat(soup);
    }
}
