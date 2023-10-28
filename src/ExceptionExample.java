import java.sql.SQLOutput;
import java.util.*;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(new RollerCoaster().ageValidity(66));
        } catch (AgeException e) {
            System.out.println(e.toString());
        }
        HashMap<Integer,Integer> tr=new HashMap<>();
        tr.put(1,6);
        tr.put(2,7);
        tr.put(3,8);
        tr.put(4,9);
        tr.put(5,10);
        ArrayList<String> list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("how");
        list.add("are");
        list.add(4,"you");
        list.add("?");
        list.add("why");
        list.add(7,"are");
        list.add("you");
        list.add(9,"here");

        System.out.println(list);
        int i=list.size()-1;
        System.out.println(i+"size");
        while (i>=7){
            list.remove(i);
            i--;
        }
        list.forEach(n-> System.out.println(n));
        for (String x:list){
            System.out.println(x);
        }
//        Iterator<String>it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        new Thread(){
            @Override
            public void run(){
                System.out.println("running in thread");
          }
        }.start();
        Runnable rn=new Runnable() {
            @Override
            public void run() {
                System.out.println("running in runnable");
            }
        };
        new Thread(rn).start();
        new Thread(()-> System.out.println("hi run")).start();

        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2==o1){
                    return 1;
                }
                return -1;
            }
        };

        System.out.println(list);

        ArrayList<String>ae=new ArrayList<>(list);







    }



}
class AgeException extends Exception{

    public AgeException(String msg){
        super(msg);
    }
}
class RollerCoaster{
    public String ageValidity(int age) throws AgeException{
        if (age<18){
            throw new AgeException("Too Young For Ride");
        } else if (age>65) {
            throw new AgeException("Too Old For ride");
        }else {
            return "Enjoy Your Ride";
        }

    }
}
