package Pakiecik;

public class Box<T> {
    private T obj;

    public void set(T t){
        this.obj = t;
    }

    public T get(){
        return obj;
    }
}
