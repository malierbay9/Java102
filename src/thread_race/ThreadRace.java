package thread_race;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace implements Runnable{

    private List<Integer> list;
    private List<Integer> oddList;
    private List<Integer> evenList;

    public ThreadRace(List<Integer> list) {
        this.list = list;
        this.oddList = new ArrayList<>();
        this.evenList = new ArrayList<>();
    }

    @Override
    public void run() {
        synchronized (new Object()){
            for(Integer a : this.list){
                if(a%2==0){
                    this.evenList.add(a);
                }
                else{
                    this.oddList.add(a);
                }
            }
        }

        printList();
    }

    public void printList(){
        System.out.print(this.oddList+"\n");
        System.out.print(this.evenList+"\n");
    }

}
