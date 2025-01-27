public class Rec3 {
    



    public static int naturalSum(int n ){
         if(n==0){
            return 0;
         }
         int fnm1 = naturalSum(n-1);
         int fn = n + fnm1;
         return fn;
    }
    public static void main (String args[]){
        System.out.print(naturalSum(5));


    }
}
