package task71;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class t8 {
    public static void main(String[] args) {
        System.out.println("Сортировка методом пузырька");

        int len = 10;
        List<Integer> array = new ArrayList<>();
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            array.add(a + (int) (Math.random() * (b + 1)));
        }
        System.out.println(Arrays.toString(array.toArray()));

        int tmp;
        for (int i = 1; i < len; i++){
            for (int j = len - 1; j >= i; j--){
                if (array.get(j) < array.get(j-1)){
                    tmp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, tmp);
                }
            }
        }
        System.out.println(Arrays.toString(array.toArray()));
    }
}

