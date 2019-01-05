package basics.mapUsage;

import java.util.HashMap;

class NewKey {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

/*下面的代码输出是1 因为：
*
* TreeMap依靠实现comparable接口 覆写compareTo函数来实现去重
* HashMap依靠hashCode函数跟equal函数来实现去重
*
* 所以下面的代码输出是1 HashMap把两个Key都当作是相同的了*/

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(new NewKey(), "value one");
        hashMap.put(new NewKey(), "value two");
        System.out.println(hashMap.size());
    }
}
