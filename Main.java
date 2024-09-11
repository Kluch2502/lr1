public class Main { 
    public static void main(String [] args) { 
        System.out.println(convert(5));
        System.out.println(calcfit(5, 10));
        System.out.println(calc(5, 0, 2));
        System.out.println(treu(5, 5,5));
        System.out.println(ternaryEvaluation(9, 10));
        System.out.println(howMany(100, 2, 2));
        System.out.println(Fuck(4));
        System.out.println(NOD(21, 226));
        System.out.println(Cash(70, 1500));
        System.out.println(Parta(5,2));
    }
    public static double convert(double x){ 
        return 3.785*x;
    }
     public static int calcfit(int x, int y){
        if (x == 1) { 
            return y;
        }
        else if (x == 2) {
            return 2*y;
        }
        else if (x == 3){
            return 3*y;
        }
        return 0;
    }

    public static int calc(int x, int y, int z){
       
        return x*20 + y*50 + z*100;
    }

    public static String treu(int x, int y, int z){
        if ((x+y>z) && (x+z>y) && (z+y>x) ) { 
            if ((x==y) && (x==z)) {
                
                return "isosceles";
            }
            else if ((x==y) || (x==z)){
                
                return "equilateral";
            }
            else {
               
                return "different-sided";
            }
        }
        else {
            return "not a triangle";
        }
    }

    public static int ternaryEvaluation(int x, int y){
       int s = x >= y ? (x) : (y);
       return s;
    }

    public static double howMany(int n, double w, double h){
        
        int s = n/2;

        return (int)(s/(w*h));

    }

    public static int Fuck(int x) { 
        int n = 1;
        int s = 1;
        while (n != x+1) {
            s = s * n;
            n++;
        }
        return s;
    }
   
    public static int NOD(int x, int y) { 
        
        while ((x != 0) && (y!=0)) {
            if (x > y) { 
                x = x % y;
            }
            else {
                y = y % x;
            }
        }
        return  x + y;
    }

    public static double Cash(int x, int y) { 
        return x*y*0.72;
        
    }

    public static double Parta(double x, double y){ 
        if (x / y > 2) {
            return Math.ceil((x % y) / 2);
        }
        else{
            return 0;
        }
    }
   
}

