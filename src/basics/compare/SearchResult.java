package basics.compare;


/*下面的Comparable<SearchResult>加上了泛型限定*/
public class SearchResult implements Comparable<SearchResult> {
    int relativeRatio;
    long count;
    int recentOrders;

    public SearchResult(int relativeRatio, long count) {
        this.relativeRatio = relativeRatio;
        this.count = count;
    }

    /*需要覆写compareTo方法*/
    @Override
    public int compareTo(SearchResult o) {
        if (this.relativeRatio != o.relativeRatio) {
            return this.relativeRatio > o.relativeRatio ? 1 : -1;
        }

        if (this.count != o.count) {
            return this.count > o.count ? 1 : -1;
        }
        return 0;
    }

    public void setRecentOrders(int recentOrders) {
        this.recentOrders =recentOrders;
    }
}
