package basics.compare;

public class Main {
    public static void main(String[] args) {
        SearchResult searchResult = new SearchResult(1, 5);
        SearchResult searchResult1 = new SearchResult(2, 4);
        System.out.println(searchResult.compareTo(searchResult1));


        SearchResultComparator searchResultComparator = new SearchResultComparator();
        System.out.println(searchResultComparator.compare(searchResult, searchResult1));

        /*Arrays.sort();*/
    }
}
