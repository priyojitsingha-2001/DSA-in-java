import java.util.*; 
public class Quicksort {
    public static int partition(int a[],int low,int high)
    {
        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                //swap
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        //swap with pivot
        i=i+1;
        int temp = a[i];
        a[i]=a[high];
        a[high]=temp;

        return i;
    }
    public static void quicksort(int a[],int low,int high)
    {
        if(low<high){
            int p=partition(a,low,high);
            //break the array into two parts from the pivot

            quicksort(a , low , p-1);
            quicksort(a , p+1 , high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        quicksort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
