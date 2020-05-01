package Day_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSort {
    public static void main(String[] args) {
        int [] given = {1, 3, 4, 7, 8, 10, 5, 19, 9, 11};
        Arrays.sort(given);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < given.length; i++){
            result.add(given[i]);
        }
        int size = result.size();
        System.out.println("Largest number is "+result.get(size - 1));
        System.out.println("Smallest number is "+result.get(0));
    }
}
