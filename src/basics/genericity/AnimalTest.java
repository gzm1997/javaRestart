package basics.genericity;

import java.util.ArrayList;
import java.util.List;

/*这一段代码主要用来解释通配符集合
*
* 通配符集合一般有两种：
* 1. <? extend>
* 2. <? super>
* 这两种 第一种是表示某个类跟这个类的子类
* 第二种表示的是某个类跟这个类的父类*/

class Animal {}
class Cat extends Animal {}
class Carfield extends Cat {}

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        List<Cat> cats = new ArrayList<Cat>();
        List<Carfield> carfields = new ArrayList<Carfield>();

        animals.add(new Animal());
        cats.add(new Cat());
        carfields.add(new Carfield());

        /*这可以引用Cat类跟他的子类*/
        List<? extends Cat> extendCat = carfields;
        /*这可以引用Cat类跟他的父类*/
        List<? super Cat> superCat = animals;

        /*子类的通配符集合是不可以add的 只可以add null这一个类型*/
        extendCat.add(null);
        /*所以下面这条语句是会编译失败的*/
//        extendCat.add(new Carfield());

        /*但是父类的通配符几个是可以add的*/
        superCat.add(new Cat());
        superCat.add(new Carfield());

        /*子类通配符集合中的元素是可以返回的 但是只赋uh值给Cat或者Cat的父类*/
        Cat test = extendCat.get(0);
        /*父类通配符集合中的元素也是可以返回的 但是只可以赋值给Object的集合 其实很好理解 Object一定会是那些类的父类*/
        Object object = superCat.get(0);
        /*下面这句会编译失败*/
//        Cat test1 = superCat.get(0);



        /*总的来说
        * 1.父类通配符集合就是有入也有出
        * 2.子类通配符集合只有出没有入
        * 3.父类通配符集合中元素只可以赋值给Object
        * 4.子类通配符集合中元素可以赋值给那个类或者他的父类*/
    }
}
