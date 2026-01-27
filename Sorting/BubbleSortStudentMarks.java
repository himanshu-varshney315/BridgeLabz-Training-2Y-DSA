package Sorting;
import java.util.*;
public class BubbleSortStudentMarks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Number of Subject: ");
        int n=sc.nextInt();
        System.out.print("Enter numbers:");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
