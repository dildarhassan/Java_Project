import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Basic_Sorting_Algo {
    public static void main(String[] args) {


        //        int arr[]={5,4,1,3,2};
//      //  bubble_sort(arr);
//       // bubble(arr);
//        selection_sort(arr);
//        print_arr(arr);
//        int arr1[]=new int[4];
//        System.out.println(arr1.length);
        int[] arr = {20,19,35,12,10,9,8,7,4,3,1};
//        bubble_sort(arr);
//        print_arr(arr);
        selection_srt(arr);
        print_arr(arr);

    }
    public static void print_arr(int array[]){
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+",");
        }
    }


    //Bubble_Sort Algorithms
    public static void bubble_sort(int array[]){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }


    //Selection Sort Algorithm
    public static void selection_sort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minPos]>array[j]  ){
                    minPos=j;
                }
            }
            System.out.println();
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;}

    }

    //Counting_Sort Algorithms
    public static void insertion_sort(int arr[]){
        int largest_no=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest_no){
                largest_no=arr[i];
            }
        }
        int count_arr[]=new int[largest_no+1];

        for (int i=0;i<arr.length;i++){
            count_arr[arr[i]]++;
        }
        int j=0;
        for (int i=0;i<count_arr.length;i++){
            while (count_arr[i]>0){
                arr[j]=i;
                j++;
                count_arr[i]--;
            }
        }
    }

    public static void selection_srt(int array[]){
        int largest_no=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (largest_no<array[i]){
                largest_no=array[i];
            }
        }
        int temp_array[]=new int[largest_no+1];
        for (int i=0;i<array.length;i++){
            temp_array[array[i]]++;
        }
        int index=0;
        for (int i=0;i<temp_array.length;i++){
            while (temp_array[i]>0){
                array[index]=i;
                index++;
                temp_array[i]--;
            }
        }
    }
}
