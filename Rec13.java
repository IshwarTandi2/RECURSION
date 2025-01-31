public class Rec13 {



    public static void towerofHanoi(int n ,String src ,String helper , String dest){
        if(n==1){
            System.out.println("transfer disk " + n +" from " + src +" to " + dest);
            return;
        }
         //3 steps process
         towerofHanoi(n-1, src, dest, helper);
         System.out.println("transfer disk " + n +" from " + src +" to " + dest);
         towerofHanoi(n-1,  helper, src , dest);
          
    }
        

    public static void main (String args[]){
        towerofHanoi(3, "S", "H", "D");
       
      

    }
    
}
