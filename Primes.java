public class Primes{
    public static void main(String[] args) {

        System.out.println(1);

        System.out.println(2);
        
        for (int i = 3; i <= 100; i++){
            
            if (isPrime(i) == true){

                System.out.println(i); 

            }

        }

    }
   
    public static boolean isPrime(int n) {
        
        for (int i = 2; i < n; i++){
            
            if (n % i == 0){
               
                return false;

            }

        }

        return true;
        
    } 
    
}