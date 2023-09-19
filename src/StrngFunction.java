import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public  class StrngFunction extends Recursion {
    static ArrayList<Character> arr = new ArrayList<>();


    public void f() {
        super.recursive(9);
        super.recursive(3);
        Recursion.recursive1(3);
        super.recursive(89);
        Recursion.recursive1(5);

    }

    public static void main(String[] args) {
        // System.out.println(palindrome("racecar"));
        //System.out.println(up("i am munim"));
        //  System.out.println(compress_string("aaavvvddde"));
//        System.out.println(strings("i love you"));
//        System.out.println(up("i love you"));
//        Recursion r=new Recursion();
        //System.out.println(palindrome("moom"));
//        String x="waaa";
//        StringBuilder stringBuilder=new StringBuilder(" ");
//        stringBuilder.toString();
//        x.charAt(0);
        int arr[]={1,2,3,4,5};
        int arr1[]={6,7,8,9,10};
        addArray(arr,arr1);










    }


    public static boolean palindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;}
        }
        return true;
    }

    public static void addArray(int arr1[],int arr2[]){
        int temp[]=new int[arr1.length+arr2.length];
        int j=0;
        for (int i=0;i<temp.length;i++){
            if (i<arr1.length){
                temp[i]=arr1[i];
            }else {
                temp[i]=arr2[j];
                j++;
            }
        }
        for (int k=0;k<temp.length;k++){
            System.out.print(temp[k]+",");
        }
    }

    public static void stringCount(String x){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<x.length();i++){
            if (!hashMap.containsKey(x.charAt(i))) {
                hashMap.put(x.charAt(i),1);
            }else {
                hashMap.put(x.charAt(i),hashMap.get(x.charAt(i))+1);
            }
        }
    }


    public static String up(String x) {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(Character.toUpperCase(x.charAt(0)));
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) == ' ' && i < x.length() - 1) {
                sb.append(x.charAt(i));
                i++;
                sb.append(Character.toUpperCase(x.charAt(i)));
            } else {
                sb.append(x.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String strings(String sentence) {
        StringBuilder newString = new StringBuilder(" ");
        newString.append(Character.toUpperCase(sentence.charAt(0)));
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && i < sentence.length() - 1) {
                newString.append(sentence.charAt(i));
                i++;
                newString.append(Character.toUpperCase(sentence.charAt(i)));
            } else {
                newString.append(sentence.charAt(i));
            }
        }
        return newString.toString();
    }

    public static String compress_string(String x) {
        String newStr = "";
        for (int i = 0; i < x.length(); i++) {
            Integer count = 1;
            while (i < x.length() - 1 && x.charAt(i) == x.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += x.charAt(i);
            if (count != 1) {
                newStr += count.toString();
            }

        }
        return newStr;
    }

    public static String SequenceString(String x) {
        StringBuilder sb = new StringBuilder("");
        char arr[] = x.toCharArray();
        Arrays.sort(arr);
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }




}
