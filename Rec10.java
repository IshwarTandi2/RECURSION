public class Rec10 {



    public static int friendsPairing(int n){
         if(n==1 || n==2){
            return n;
         }
         //choices
         // for single
        int single = friendsPairing(n-1) ;
        //for pair
        int pair = (n-1)*friendsPairing(n-2);
         //total ways
         int totalways = single + pair;
         return totalways;
    }
    public static void main (String args[]){
        System.out.print(friendsPairing(4));

    }
    
}
