public class Rec7 {
    


    //x^n = x*x^n-1

    public static int x2N(int x ,int n){
        // TC = O(n)
        if(n==0){
          return 1;
        }
        return x * x2N(x, n-1);

    }

    /*optimized

     C1 : Even -> 2^10 = x^n/2 * x^n/2
     C2 : Odd -> 2^5   = x * x^n/2 * x^n/2

    */
    
    public static int optimizedPower(int x ,int n){
        // TC = O(logn)
        if(n==0){
          return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowersq = halfpower * halfpower;
        if(n%2 != 0){
        return x * halfpowersq;
        }
        return halfpowersq;

    }
    public static void main (String args[]){
          System.out.print(optimizedPower(2, 5));
    }
}
