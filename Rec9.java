public class Rec9 {



public static void removeDuplicate(String str,int i,StringBuilder newstr , boolean map[]){
      //basecase
      if(i==str.length()){
        System.out.print(newstr);
        return;
      }
      char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, i+1, newstr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, i+1, newstr.append(currChar), map);
        }
}
    public static void main (String args[]){
      String str = "appnnacollege";
      removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
    
}
