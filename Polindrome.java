public class Polindrome{
    public static void main(String[] args){
       
        for (int i = 0; i < args.length; i++) {

            String s1 = args[i];
            if (isPolindrome(s1)){
                System.out.println("Полиндром");
            }
            else{
                System.out.println ("Не полиндром");
            }
            
            
        }
        
        
    } 

    public static String reverseString(String s){ 

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            
            str = s.charAt(i) + str;

        }

        return str;

    
    }

     public static boolean isPolindrome(String s) {

        return reverseString(s).equals(s);

    }


}

    
