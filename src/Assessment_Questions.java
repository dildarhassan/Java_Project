import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Assessment_Questions {
    public Assessment_Questions() {
    }

    public static void main(String[] args) {
//        List<Integer> l= Arrays.asList(1,2,3,4);
//        List<Integer> list = cardinality(l);
//        System.out.println(list);
//
//        int[] a=insertionSort(new int[]{2,5,3,9,8});
//        for (int f:a){
//            System.out.println(f);
//        }
//        int[] arr1={1,2,6,6,5};
//        System.out.println(sumOfpairs(arr1));
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        list.remove(3);
//        list.add(3, 5);
//        System.out.println(list);
//        new StrngFunction();
       // System.out.println(fact(4+1));
        loopConcept(5);
    }

    public static String compress_string(String str) {
        String newStr = "";
        String token = "1r9ov6th508";

        for(int i = 0; i < str.length(); ++i) {
            int count=1;
           while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               count++;
               i++;
            }

            newStr+=str.charAt(i);
            if (count > 0) {
                newStr = newStr + Integer.toString(count);
            }
        }

        return newStr;
    }

    public static int maxMoves(List<Integer> list1, List<Integer> list2) {
        int moves = 0;

        for(int i = 0; i < list1.size(); ++i) {
            int list1No = (Integer)list1.get(i);
            int list2No = (Integer)list2.get(i);
                int digit1 = list1No % 10;
                int digit2 = list2No % 10;
                moves += Math.max(digit1, digit2) - Math.min(digit1, digit2);
                list1No /= 10;
                list2No /=10;

        }

        return moves;
    }

    public static List<Integer> cardinality(List<Integer> list) {
        int[] OnesCountArr = new int[list.size()];
        int[] onesCountArr = new int[list.size()];
        for (int i=0;i<list.size();i++){
            int curr=list.get(i);
             int oneCount=0;
            while (curr>0){
                if(curr%2==1){
                    oneCount++;
                }
                curr/=2;
            }
            onesCountArr[i]=oneCount;
        }
        for(int l = 1; l < OnesCountArr.length; l++) {
            int curr = onesCountArr[l];
            int curr1=list.get(l);
            int previous=l-1;
            while (previous >= 0 && onesCountArr[previous] > curr) {
                onesCountArr[previous + 1] = onesCountArr[previous];
                previous--; 
                //list.add(previous+1,list.get(previous));
            }
            onesCountArr[previous + 1] = curr;

        }
        return list;
    }

    public static List<Integer> cardinality1(List<Integer> list){
        List<Integer> sortedList=new ArrayList<>(list.size());
        int[] dupArray=new int[list.size()];
        int[] onesCount=new int[list.size()];

        for (int i=0;i<list.size();i++){
            int no=list.get(i);
            int binaryNo=0;
            int pow=0;
            while (no>0){
                int rem=no%2;
                binaryNo+=rem*Math.pow(10,pow);
                pow++;
                no/=2;
            }
            String bin=String.valueOf(binaryNo);
            int countOf1=0;
            for (int j=0;j<bin.length();j++){
                if (bin.charAt(j)=='1'){
                    countOf1++;
                }
            }
            onesCount[i]=countOf1;
            dupArray[i]=list.get(i);
        }
        for (int k=0;k<onesCount.length-1;k++){
            int minipos=k;
            for (int l=k+1;l<onesCount.length;l++){
                if (onesCount[minipos]>onesCount[l]){
                    minipos=l;
                }
            }
            int tempr=onesCount[minipos];
            onesCount[minipos]=onesCount[k];
            onesCount[k]=tempr;
            int temp=dupArray[minipos];
            dupArray[minipos]=dupArray[k];
            dupArray[k]=temp;
            sortedList.add(dupArray[k]);

        }
        sortedList.add(dupArray[list.size()-1]);

        return sortedList;
    }

    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            int curr = arr[i];
            int previous=i-1;
            while (previous >= 0 && arr[previous] > curr) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = curr;
        }
        return arr;
    }
    public  static boolean palindrome(String x){
        boolean result=true;
        int start=0;
        int end=x.length()-1;
        while (start<end){
            if (x.charAt(start) != x.charAt(end)) {
                result = false;
                return result;
            }
            start++;
            end--;
        }
        return result;
    }
    public static int sumOfpairs(int[] arr)  {
        int maxpairs=0;
        ArrayList<Integer> arrList=new ArrayList<>();
        for (int x=0;x<arr.length;x++){
            if (!arrList.contains(arr[x])){
                arrList.add(arr[x]);
            }
        }
        int no=0;
        for (int i=0;i<arrList.size();i++){
            for (int j=i+1;j<arrList.size();j++){
                no++;
            }
        }
        int[] arrTemp=new int[no];
        int index=0;
        for (int i=0;i<arrList.size();i++){
            for (int j=i+1;j<arrList.size();j++){
                arrTemp[index]=arrList.get(i)+arrList.get(j);
                index++;
            }
        }
        int max=0;
        for (int k : arrTemp) {
            if (max < k) {
                max = k;
            }
        }
        int[] freq=new int[max+1];
        System.out.println(freq.length);
        for (int j : arrTemp) {
            freq[j]++;
        }
        for (int i : freq) {
            if (maxpairs < i) {
                maxpairs = i;
            }
        }
        return maxpairs;
    }
    public static int fact(int n){

        if (n==1){
            return 1;
        }
        //int x= n*(n-1);
        return n*fact(n-1);

        
    }
    public static void loopConcept(int n) {
        for (int i=1;i<=4;i++){
            for (int j = 1; j <= (4 - i); j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //Finding The Month Of The Year
    public static String findMonth(int month){
        if (month!=0){
            String[] arr={"January","February","March","April","May","June","July","August","September","October","November","December"};
            return (arr[month-1]);
        }else {
            return "0 is Invalid";
        }
    }
}

