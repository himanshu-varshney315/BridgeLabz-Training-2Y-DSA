package Sorting;
import java.util.*;
public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Number of Employees: ");
        int n=sc.nextInt();
        System.out.print("Enter Ids:");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }

        for (int i = 1; i <n ; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
