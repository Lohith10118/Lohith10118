import java.util.*;
public class SecondMaxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>max){
                secondMax=max;
                max=arr[k];
            }
            else if(arr[k]>secondMax && arr[k]!=max){
                secondMax=arr[k];

            }
        }
        System.out.print(secondMax);
    }
}

