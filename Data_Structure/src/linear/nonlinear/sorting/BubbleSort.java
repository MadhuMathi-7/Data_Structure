//package sorting;
//public class BubbleSort {
//     static void bubblesort(int[] arr,int n) {
//        int i,j,temp;
//        boolean swapped;
//        for( i=0;i<n-1;i++) {
//            swapped=false;
//            for( j=0;j<n-1-i;j++) {
//                if(arr[j]>arr[j+1]) {
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    swapped=true;
//                }
//            }
//            if(!swapped) {
//                break;
//            }
//        }
//    }
//    static void print(int[] arr,int size) {
//        int i;
//        for( i=0;i<size;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int[] arr= {56,59,38,48,17,41};
//        int n=arr.length;
//        bubblesort(arr,n);
//        System.out.println("Sorted array:");
//        print(arr,n);
//    }
//
//}








package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int i:arr) System.out.println(i);
    }

}