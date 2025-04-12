import java.util.*;
public class TwoPointers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]==1 && arr[r]==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l=l+1;
                r=r-1;
            }
            else if (arr[l]==0){
                l=l+1;
            }
            else{
                r=r-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}