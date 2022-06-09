//worst(t)-O(n^2)
import java.util.*;
public class selection_sort {
    public static void selectionsort(int a[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
               if (a[j]<a[min]) {
               int temp=a[min];
               a[min]=a[j];
               a[j]=temp;
               } 
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size then elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        selectionsort(a,n);
    }
}
