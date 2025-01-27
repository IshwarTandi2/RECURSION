public class Rec6 {

    public static int firstOccurencE(int arr[],int i, int key){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==key){
            return i;
        }
        return firstOccurencE(arr, i+1, key);
    }
    public static int lastOccurence(int arr[],int i , int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main (String args[]){
        int arr[] = {1,2,4,5,3,4,4};
        System.out.print(lastOccurence(arr, 0, 4));

    }
}
