public class Rec4 {
    

public static int printFib(int n){
     if(n==0 || n==1){
         return n;
     }
     int fib1 = printFib(n-1);
     int fib2 = printFib(n-2);
     return fib1 + fib2;
}
    public static void main (String args[]){
       System.out.print(printFib(6));
    }
}
