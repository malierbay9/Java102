package own_list_class;

import java.util.Arrays;

public class MyList <T> {
    private int capacity;
    private Object[] arr;

    public MyList() {
        this.capacity = 10;
        this.arr = new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[this.capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {

        if (!isCapFull(this.arr)) {
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == null) {
                    this.arr[i] = data;
                    break;
                }
            }
        } else {
            Object[] tempArr = this.arr;
            this.arr = new Object[this.getCapacity()];
            for (int i = 0; i < tempArr.length; i++) {
                this.arr[i] = tempArr[i];
            }

            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == null) {
                    this.arr[i] = data;
                    break;
                }
            }
        }

    }

    public void printList() {
        System.out.print("{ ");
        for(Object a : this.arr){
            if(a!=null){
                System.out.print(a+" ");
            }
        }
        System.out.print("}");
        System.out.println();

    }

    private boolean isCapFull(Object[] arr) {
        if (arr[this.capacity - 1] != null) {
            this.capacity *= 2;
            return true;
        } else
            return false;

    }

    public T get(int index) {
        return (T) this.arr[index];
    }

    public int size(){
        int ct=0;
        for(Object a : this.arr){
            if(a!=null){
                ct++;
            }
        }
        return ct;
    }

}
