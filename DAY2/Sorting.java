import java.util.*;
public class Sorting{
    public static void main(String[]args){
        int arr[] ={6,7,8,2,4,15};
        System.out.println("Array befor sorting" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting:"+Arrays.toString(arr));
        
    }
    // private static void selectionSort(int[] arr){
    //     // int temp;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]>arr[j]){
    //                 // temp=arr[i];
    //                 // arr[i]=arr[j];
    //                 // arr[j]=temp;
    //                 arr[i]=arr[i]+arr[j];
    //                 arr[j]=arr[i]-arr[j];
    //                 arr[i]=arr[i]-arr[j];
    //             }
    //         }
    //     }
    // }
    // private static void bubbleSort(int[] arr){
    //     int temp;
    //     for(int i=1;i<arr.length;i++){
    //         for(int j=0;j<arr.length-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
                  
    //         }
    //     }
    // }
    
    private static void insertionSort(int[] arr){
        int temp;//max index of the card is j
        for(int k=1;k<arr.length;k++){
            temp=arr[k];
            int j=k-1;
            while(j>=0 && temp<=arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}