import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88,99);
        System.out.println(list);
        reverse(list);
        System.out.println(list);

    }

    public static void reverse(List<Integer> list){
        //        Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            ElementSwapping.swap(list, i, list.size() -1 -i);


        }

    }
}
