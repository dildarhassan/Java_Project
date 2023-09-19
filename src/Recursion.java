public class Recursion {

    public static void main(String[] args) {
        int n=10;
        recursive1(n);

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
}
