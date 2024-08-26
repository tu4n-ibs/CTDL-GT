import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

//        nhi phan
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 3, 6, 7, 9, 2};
        int key = 6;
        System.out.println(binarySearch.binarySearch(arr, key));
// tuyen tinh
        LinearSearch linearSearch = new LinearSearch();
        int[] arr2 = {1, 3, 6, 7, 9, 2};
        int x = 7;
        System.out.println(linearSearch.LineaSearch(arr2, x));

        GiaiThua giaiThua = new GiaiThua();
        int a = 5;
        System.out.println(giaiThua.GiaiThua(a));
    }


}