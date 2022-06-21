package thread_race;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        for(int i = 1;i<=100;i++){
            numList.add(i);
        }

        ThreadRace t1 = new ThreadRace(numList);

        ExecutorService executor  = Executors.newFixedThreadPool(4);
        executor.execute(t1);
        executor.shutdown();

    }
}
