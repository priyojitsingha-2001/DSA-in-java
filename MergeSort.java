import java.util.Scanner;

/**
 * MergeSort
 */
public class MergeSort {

    static void merge(int arr[],int low,int mid,int high){
        int b[]=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
            if(arr[i]<arr[j]){
                b[k++]=arr[i++];
            }
            else
            {
                b[k++]=arr[j++];
            }
        }
        while (i<=mid) {
            b[k++]=arr[i++];
        }
        while (j<=high) {
            b[k++]=arr[j++];
        }
        for(i=0,j=low;i<b.length;i++,j++){
            arr[j]=b[i];
        }
    }
    static void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr, mid+1, high);

            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}