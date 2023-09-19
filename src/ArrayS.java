import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayS {
    public ArrayS() {
    }

    public static void main(String[] args) {
        char[] ch = new char[]{'a', 'b', 'c', 'a', 'b', 'e'};
        hashmap(ch);
        hash();
    }

    public static int linearSearch(int[] number, int num) {
        for(int i = 0; i < number.length; ++i) {
            if (number[i] == num) {
                System.out.println(i);
                return i;
            }
        }

        return -1;
    }

    public static void arrayCreation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int[] array = new int[sc.nextInt()];

        int i;
        for(i = 0; i < array.length; ++i) {
            System.out.println("Enter " + i + " no element :");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are");

        for(i = 0; i < array.length; ++i) {
            System.out.print(array[i] + ",");
        }

    }

    public static int largest_elementOf_array(int[] array) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; ++i) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int[] arrayReverse(int[] array) {
        for(int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return array;
    }

    public static int[] arrayRvrc(int[] array) {
        int start = 0;

        for(int end = array.length - 1; start < end; --end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            ++start;
        }

        return array;
    }

    public static void pairs_in_array(int[] array) {
        int tp = 0;

        for(int i = 0; i < array.length; ++i) {
            int current = array[i];

            for(int j = i + 1; j < array.length; ++j) {
                System.out.print("(" + current + "," + array[j] + ")");
                ++tp;
            }

            System.out.println();
        }

        System.out.println(tp);
    }

    public static void sub_array(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = i; j < array.length; ++j) {
                for(int k = i; k <= j; ++k) {
                    System.out.print(array[k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

    }

    public static void stock(int[] array) {
        int buy_price = Integer.MAX_VALUE;
        int sell_price = Integer.MIN_VALUE;
        int index = 0;
        int profit = 0;

        int loss;
        for(loss = 0; loss < array.length; ++loss) {
            if (buy_price > array[loss]) {
                buy_price = array[loss];
                index = loss;
            }
        }

        for(loss = index; loss < array.length; ++loss) {
            if (sell_price < array[loss]) {
                sell_price = array[loss];
            }
        }

        if (buy_price < sell_price) {
            profit = sell_price - buy_price;
            System.out.println(profit);
        } else {
            loss = buy_price - sell_price;
            System.out.println("Loss=" + loss);
        }

        System.out.println(Integer.MAX_VALUE);
    }

    public static int buyAndsell(int[] price) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < price.length; ++i) {
            if (buy < price[i]) {
                int profit = price[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = price[i];
            }
        }

        return maxProfit;
    }

    public static void ch(String x) {
        for(int i = 0; i < x.length(); ++i) {
            for(int j = i + 1; j < x.length(); ++j) {
                if (x.charAt(i) == x.charAt(j)) {
                    System.out.println("  " + j + "is  " + x.charAt(j));
                }
            }
        }

    }

    public static int maxOf_subArray(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        int current_value = 0;

        for(int i = 0; i < array.length; ++i) {
            for(int j = i; j < array.length; ++j) {
                for(int k = i; k <= j; ++k) {
                    current_value += array[k];
                }

                if (max_sum < current_value) {
                    max_sum = current_value;
                }

                current_value = 0;
            }
        }

        return max_sum;
    }

    public static int kadans_algo(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < array.length; ++i) {
            current_sum += array[i];
            if (current_sum < 0) {
                current_sum = 0;
            }

            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }

    public static int trapping_rainwater(int[] array) {
        int total_rainWater = 0;
        int[] leftMax_boundary = new int[array.length];
        int[] rightMax_boundary = new int[array.length];
        leftMax_boundary[0] = array[0];

        int i;
        for(i = 1; i < array.length; ++i) {
            leftMax_boundary[i] = Math.max(array[i], leftMax_boundary[i - 1]);
        }

        rightMax_boundary[array.length - 1] = array[array.length - 1];

        for(i = array.length - 2; i >= 0; --i) {
            rightMax_boundary[i] = Math.max(array[i], rightMax_boundary[i + 1]);
        }

        for(i = 0; i < array.length; ++i) {
            int waterLevel = Math.min(rightMax_boundary[i], leftMax_boundary[i]);
            total_rainWater += waterLevel - array[i];
        }

        return total_rainWater;
    }

    public static int buy_sell_stock(int[] array) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0; i < array.length; ++i) {
            System.out.println(buy_price);
            if (buy_price < array[i]) {
                int profit = array[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = array[i];
            }
        }

        return max_profit;
    }

    public static void arr(String y) {
        String x = y.toLowerCase();
        int count = 0;

        for(int i = 0; i < x.length(); ++i) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u') {
                ++count;
            }
        }

        System.out.println(count);
    }

    public static int platform() {
        int[] arrival = new int[]{900, 940, 950, 1100, 1500, 1800};
        int[] departure = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        int platform_no = 1;
        int j = 0;

        for(int i = 1; i < arrival.length; ++i) {
            if (arrival[i] < departure[j]) {
                ++platform_no;
            } else {
                --platform_no;
            }

            ++j;
        }

        return platform_no;
    }

    public static int abc() {
        int a = 12;
        int b = 3;
        int c = a / b;
        b = a + c;
        a -= b;
        return a;
    }

    public static int[] arr(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            int minNum = i;

            int j;
            for(j = i + 1; j < arr.length; ++j) {
                if (arr[minNum] > arr[j]) {
                    minNum = j;
                }
            }

            j = arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = j;
        }

        return arr;
    }

    public static void hashmap(char[] arr) {
        HashMap<Character, Integer> hash = new HashMap();

        for(int i = 0; i < arr.length; ++i) {
            if (!hash.containsKey(arr[i])) {
                hash.put(arr[i], 1);
            } else {
                hash.put(arr[i], (Integer)hash.get(arr[i]) + 1);
            }
        }

        System.out.println(hash);
    }

    public static void hash() {
        String str = "hello world";
        HashMap<Character, Integer> charCount = new HashMap();

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, (Integer)charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);
    }
}
