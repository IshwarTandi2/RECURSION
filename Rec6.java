public class Rec6 {

    public static int firstOccurence(int arr[],int i, int key){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main (String args[]){
        int arr[] = {1,2,4,5,3};
        System.out.print(firstOccurence(arr, 0, 3));

    }
}
