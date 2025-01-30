public class Rec11 {
    
    public static void printBinStrings(int n , int lastPlace , String newstr){
        if(n==0){
            System.out.println(newstr);
            return;
        }

       /* if(lastplace == 0){
            printBinStrings(n, 0, newstr+="0");
            printBinStrings(n, 1, newstr+="1");
        }
        else {
            // condition - when -> if(lastplace == 1)
            printBinStrings(n, 0, newstr+="0"); 
            }  */
         
            printBinStrings(n-1, 0, newstr+"0");
            if(lastPlace == 0){
             printBinStrings(n-1, 1, newstr+"1"); 

       }   
    }

    public static void main (String args[]){
        printBinStrings(3, 0, "");
    }
}
