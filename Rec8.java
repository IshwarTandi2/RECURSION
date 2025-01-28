public class Rec8 {
    


    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //choice
        int vertical = tilingProblem(n-1);
        int horizontal = tilingProblem(n-2);
        int totalways = vertical + horizontal;
        return totalways;
    }

    public static void main (String args[]){
        System.out.print("The total no of ways are : " + tilingProblem(4));
    }
}
