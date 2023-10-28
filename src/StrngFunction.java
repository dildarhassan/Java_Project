import java.util.*;
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
//        int arr[] = {1, 2, 3, 4, 5};
//        int arr1[] = {6, 7, 8, 9, 10};
//        addArray(arr, arr1);
       //phno("hello how are you here ");
       // System.out.println(WordtoDigit("one four two six double four triple six nine"));


//        String[] stringsArr=new String[10];
//
//        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<stringsArr.length;i++){
//            stringsArr[i]=sc.next();
//        }
//        int i=0;
//        while (i<stringsArr.length){
//
//            i++;
//        }

//        String word=new Scanner(System.in).next();
//        int noOfWord=1;
//        int noOfSpace=0;
//        int noOfUpper=0;
//        int noOfLower=0;
//        int niOfChar=0;
//        for (int i=0;i<word.length();i++){
//            if (word.charAt(i)!=' '){
//                niOfChar+=1;
//            }
//            if (word.charAt(i)==' '){
//                noOfSpace+=1;
//                noOfWord+=1;
//            }
//            if (Character.isUpperCase(word.charAt(i))){
//                noOfUpper+=1;
//            }
//            if (Character.isLowerCase(word.charAt(i))){
//                noOfLower+=1;
//            }
//        }
       // System.out.println(wordToDigit("nine six four double eight triple six nine"));
//        System.out.println(isPrime(5));
//        int start = 10;
//        int end = 20;
//        int[] result = fun(start, end);
//
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
      //  System.out.println(BigNo(55,36,32));

        TreeSet<String> lexicographicSet = new TreeSet<>();

        // Adding strings to the TreeSet
        lexicographicSet.add("apple");
        lexicographicSet.add("cherry");
        lexicographicSet.add("banana");

        lexicographicSet.add("date");

        // Elements will be stored lexicographically
        for (String s : lexicographicSet) {
            System.out.println(s);
        }
        System.out.println(lexicographicSet);



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

    public static String wordToDigit(String no) {
        HashMap<String, String> phNo = new HashMap<>();
        phNo.put("zero", "0");
        phNo.put("one", "1");
        phNo.put("two", "2");
        phNo.put("three", "3");
        phNo.put("four", "4");
        phNo.put("five", "5");
        phNo.put("six", "6");
        phNo.put("seven", "7");
        phNo.put("eight", "8");
        phNo.put("nine", "9");

        String[] str=no.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length;i++){
            if (!str[i].equals("double") && !str[i].equals("triple")){
                sb.append(phNo.get(str[i]));
            }else if (str[i].equals("double")){
                i++;
                sb.append(phNo.get(str[i])).append(phNo.get(str[i]));
            }else{
                i++;
                sb.append(phNo.get(str[i])).append(phNo.get(str[i])).append(phNo.get(str[i]));
            }
        }
        return sb.toString();
    }

    public static boolean isPrime(int num){

        if (num==2){
            return true;
        }
        for (int i=2;i<num;i++){

            if (num%i== 0) {
                System.out.println("not prime");
                return false;

            }
        }
        return true;

//        boolean prime=true;
//        for (int i=2;i<100;i++){
//            for (int j=2;j<i;j++){
//                if (i%j==0){
//                    prime=false;
//                    break;
//                }
//            }
//        }
//        return prime;
    }
    static int[] fun(int start,int end){
        int[] arr=new int[(end-start)/2];
        int j=0;
        for (int i=start;i<end;i++){
            if (i%2==0){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
    public static int biggerOfThreeNo(int a,int b,int c){
        int max=a>b?a:b;
        return max>c?max:c;
    }
}
