import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    int j = 0;
    Thread t = new Thread() {
        public void run() {
            for(int i = 0; i < 100; ++i) {
                System.out.println("hello");
                ++Main.this.j;
            }

        }
    };
    Thread t1 = new Thread() {
        public synchronized void run() {
            for(int i = 0; i < 100; ++i) {
                System.out.println("hi");
                ++Main.this.j;
            }



        }

    };
    Runnable r = () -> {
        System.out.println("munim");
    };

    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world!");
//        Main main = new Main();
//        Thread t1 = new Thread(main.r);
//        t1.start();
//        List<String> list1 = u();
//        System.out.println(list1);
        new Thread(()-> System.out.println("hi")).start();
        demo();



    }
    public static List<String> u() {
        List<String> list = new ArrayList<>();
        list.add("munim");
        list.add("munnaw");
        list.add("bappydda");
        list.add("amin");
        Comparator<String> c = new Comparator<String>() {
            public int compare(String i, String j) {
                return i.length() > j.length() ? 1 : -1;
            }
        };
        Collections.sort(list, c);
        return list;
    }
    public static void demo(){
        List<Integer> l= Arrays.asList(1,4,2,8,5);
        Consumer<Integer> con=(n)-> System.out.println(n);
        l.forEach(con);
        Stream<Integer> s1=l.stream();
        l.sort((i,j)->i<j?1:-1);

        List<Integer> l2=l.stream().sorted((i,j)->i<j?1:-1).toList();
        System.out.println(l2);

        Runnable runnable=new Runnable(){
            @Override
            public void run(){
                System.out.println("runing");

            }
            public void code(){
                System.out.println("coding");
            }
        };
        //Runnable runnable1=;
        new Thread(() -> System.out.println("running")).start();

        };



}


