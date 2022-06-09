import java.util.Scanner;
/*
*quicksort
*worst time complexity-O(n^2)
*average time complexity-O(n^2)
*best time complexity-O(n)
*/
public class bubble_sort {
    static void bubblesort(int a[],int n)
    {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1])
                {
                    //swaping two adjacent elements
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        bubblesort(a, n);
    }
}
