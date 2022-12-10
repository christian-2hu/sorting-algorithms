package mergesort;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        var ms = new MergeSort();
        int[] array = ms.generateArray();
        System.out.println("Array before merge sorting");
        ms.printArr(array);
    }
    public int[] generateArray() {
        Random random = new Random();
        int[] num = new int[7];
        for(int i = 0; i < num.length; i++) {
              num[i] = random.nextInt(15);
        }
        return num;
     }
     public void printArr(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
           if(i == arr.length-1) {
              System.out.print(arr[i]);
              break;
           }
           System.out.print(String.format("%s, ", arr[i]));
        }
        System.out.println("]");
     }
}
