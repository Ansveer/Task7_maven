package task71;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class t5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Последовательность Фибоначчи");

        System.out.print("Введите количество чисел: ");
        int num = in.nextInt();

        if ((num >= 2) && (num <= 100)){
            List<Integer> array = new ArrayList<>();
            array.add(0);
            array.add(1);
            for (int i = 2; i <= num; ++i) {
                array.add(array.get(i - 1) + array.get(i - 2));
            }

            for (int i = 0; i < num; i++){
                System.out.print(array.get(i));
                System.out.print(' ');
            }
        } else {
            System.out.print("Введено недопустимое число " + num + ". Допустимый диапазон значений: 2 - 100");
        }
    }
}
