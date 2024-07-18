package RECURSION;

public class FirstOccurence {


    public static int find(int arr[],int i,int key){
         if(i==arr.length){
            return -1;
         }
         else if(arr[i]==key){
            return i;
         }
         return find(arr,i+1,key);
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,5,5,4,5};
        System.out.print(find(arr,0,50));    }
    
}
