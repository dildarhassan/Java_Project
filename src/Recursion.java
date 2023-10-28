public class Recursion {

    public static void main(String[] args) {
        int n=10;
       // recursive1(n);
        System.out.println(fib(10));

    }
    public  void recursive(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        recursive(n-1);
    }

    public static void recursive1(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        recursive1(n-1);
        System.out.print(n+" ");

    }
    static int fib(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return fib1+fib2;
    }
}
