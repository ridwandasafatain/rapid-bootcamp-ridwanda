package genericType;

public class DataGeneric<T> {
    private T data;

    //generic method
    static <T> int count(T[] array){
        return array.length;
    }

    public DataGeneric(){

    }

    public DataGeneric(T data) {//konstruktor

        this.data = data;//langsung bisa diset di main
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }
}
