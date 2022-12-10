package quicksort;
import java.util.Random;

public class QuickSort {
   public static void main(String[] args) {
      var qs = new QuickSort();
      //int[] array = {8, 2, 4, 7, 1, 3, 9, 6, 5};
      int[] array = qs.generateArray();
      System.out.println("Array before quick sorting");
      qs.printArr(array);
      qs.quicksort(array, 0, array.length-1);
      System.out.println("Array after quick sorting");
      qs.printArr(array);
   }
   public void quicksort(int[] arr, int low, int high) {
      if(low >= high){
         return;
      }
      int pivot = high;
      int leftPtr = low-1;
      int temp = -1;
      for(int i = low; i < high; i++) {
         if(arr[i] < arr[pivot]) {
            leftPtr++;
            temp = arr[leftPtr];
            arr[leftPtr] = arr[i];
            arr[i] = temp;
         }
      }
      // final rest place of our pivot
      leftPtr++;
      temp = arr[leftPtr];
      arr[leftPtr] = arr[pivot];
      arr[pivot] = temp;
      // since leftPtr became our new pivot's offset...
      quicksort(arr, low, leftPtr-1);
      quicksort(arr, leftPtr+1, high);
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
