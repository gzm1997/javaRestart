package basics.compare;

import java.util.Comparator;


/*这里我们实现的是比较器comparator 这样可以让我们对比较标准进行修改的时候可以不修改我们已经交付的代码SearchResult 直接按照需求修改比较器就可以了
*
* 我们可以看到下面的Comparator<SearchResult>接口也是添加了泛型限定的*/
public class SearchResultComparator implements Comparator<SearchResult> {
    @Override
    public int compare(SearchResult o1, SearchResult o2) {
        if (o1.relativeRatio != o2.relativeRatio) {
            return o1.relativeRatio > o2.relativeRatio ? 1 : -1;
        }
        if (o1.recentOrders != o2.recentOrders) {
            return o1.recentOrders > o2.recentOrders ? 1 : -1;
        }
        if (o1.count != o2.count) {
            return o1.count > o2.count ? 1 : -1;
        }
        return 0;
    }
}
