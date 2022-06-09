import java.util.*;
public class insertion_sort {
    static void insertion_sort(int a[], int n){
        int key,j;
        for(int i=1;i<n;i++){
            key=a[i];
            j=i-1;
            while(j>=0&&key<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size and \nthen the elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion_sort(arr,n);
    }
}
