import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
 /*
        list.add(10);
        list.add(30);
        list.add(1,20);
        list.set(0,5);

        list.add(30);
        list.add(30);
        list.add(30);

        System.out.println(list.indexOf(30));
        System.out.println(list.contains(10));

        for (Integer j:list) {
            System.out.print(j + " ");
        }

*/

        int startValue = 0;
        int endValue = 10000;
        int i = 0;
        while (startValue < endValue) {
            startValue = (int) Math.pow(i, 2);
            list.add(startValue);
            i++;
        }
        for (Integer j:list) {
            System.out.print(j + " ");
        }

        ArrayList<Integer> listCopy = new ArrayList<>();
        for (Integer j:list) {
            if (j % 2 == 0  || j % 3 == 0)
                listCopy.add(list.indexOf(j));
        }

        System.out.println("--------------");
        for (Integer j:listCopy) {
            System.out.print(j + " ");
        }

        list.remove((Integer) 4); //удаление


    }
}