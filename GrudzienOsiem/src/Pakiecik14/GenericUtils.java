package Pakiecik14;

public class GenericUtils {
    public static <T extends Comparable<T>> T minValue(T[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Problem z tablica");
        }
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }
        return min;
    }
}
