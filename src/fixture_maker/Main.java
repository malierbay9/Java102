package fixture_maker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("Galatasaray");
        list.add("Bursaspor");
        list.add("Fenerbahçe");
        list.add("Beşiktaş");
        list.add("Başakşehir");
        list.add("Trabzonspor");
        FixtureMaker fixtureMaker = new FixtureMaker();
        List<List<Match>> all= fixtureMaker.getFixtures(list);
        fixtureMaker.print(all);

    }
}
