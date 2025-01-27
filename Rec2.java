public class Rec2{
 
    public static int printFact(int n){
        if(n==0){
            
            return 1 ;
        }
        int fnm1 = printFact(n-1);
        int fn = n*fnm1;
        return fn;

    }

    public static void main (String args[]){
        System.out.print( printFact(5));
       
    }
}