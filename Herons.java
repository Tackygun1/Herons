public class Herons{



    public static double findRoot(double x){
        double guess = 1.00;
        double i = x/guess - guess;

        while (i > .000000000001){
            guess = (guess + (x/guess))/2;
            i = (x/guess - guess)*(-1); 
           
        }

        return guess;
    }
    public static void main(String[] args){
        System.out.println("25: "+findRoot(25));
        System.out.println("2: "+findRoot(2));
        System.out.println("115: "+findRoot(115));

        

        

    }
}