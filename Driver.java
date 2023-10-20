public class Driver { // driver class
    
    public static void main(String[]args) // main method to call calculator class
    {
        Calculator Object1 = new Calculator(); // first operation 
        
        double x = 5.0; // setting x variable to 5.0
        double y = 6.0; // setting y variable to 6.0
        System.out.printf("%.1f + %.1f = %.1f", x, y, Object1.add(x,y)); // printing out addition of double values 
        System.out.printf("\n%.1f * %.1f = %.1f\n", x, y, Object1.multiply(x,y)); // printing out multiplication of double values 

    }
}
