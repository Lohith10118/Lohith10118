import java.util.*;

public class NonRep {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int k=0;k<arr.length;k++){
            map.put(arr[k],map.getOrDefault(arr[k],0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int l=0;l<arr.length;l++){
            if(map.get(arr[l])>1 &&  !set.contains(arr[l])){
                System.out.print(arr[l]);
                set.add(arr[l]);
            }
        }
        System.out.println();
        }
    }
}
