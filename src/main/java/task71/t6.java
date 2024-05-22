package task71;
import java.util.List;
import java.util.ArrayList;

public class t6 {
    public static void main(String[] args){
        System.out.println("Случайные числа");

        int len = 100;
        List<Integer> array = new ArrayList<>();
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            array.add(a + (int) (Math.random() * (b + 1)));
        }

        System.out.println("Максимальное значение = " + max_num(array, len) + " находится в элементе под индексом "
                + arr_max_index(array, max_num(array, len), len));
        System.out.print("Среднее значение = " + average_value(array, len));

    }
    static int max_num(List<Integer> arr, int len){
        int max = 0;

        for (int i: arr){
            if (i > max){
                max += i;
            }
        }

        return max;
    }

    static int arr_max_index(List<Integer> arr, int max, int len) {
        int index = 0;

        for (int i = 0; i < len; i++){
            if (max == arr.get(i)){
                index = i;
            }
        }
        return index;
    }

    static int average_value(List<Integer> arr, int len){
        int sum = 0;

        for (int i: arr){
            sum += i;
        }

        return sum / len;
    }
}

