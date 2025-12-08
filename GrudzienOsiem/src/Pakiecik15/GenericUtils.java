package Pakiecik15;

public class GenericUtils {
    public static <T extends Comparable<T>> T minValue(T[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Problem z tablica");
        }
        T max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
}
