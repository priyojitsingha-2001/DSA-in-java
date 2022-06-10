import java.util.*;
public class LinearSearch {
    static int linearSearch(int arr[],int n,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
            return i;//returns the index at which the element was found
        }
        return -1;//returns -1 if element not found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched for: ");
        int x=sc.nextInt();
        if(linearSearch(arr, n, x)==-1)
            System.out.println("Search unsuccessful");
        else
            System.out.println("element found at: "+linearSearch(arr, n, x));
    }
}
