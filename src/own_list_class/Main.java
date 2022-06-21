package own_list_class;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> a =new MyList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.add(11);

        a.printList();
        System.out.println(a.size());
        System.out.println(a.getCapacity());
    }
}
