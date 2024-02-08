

public class Array2D {
    public static void main(String[] args) {
        float floatValue = 123.48F; // Replace with your float value
        int intValue = (int) floatValue;
        int decimalAsInt = (int) ((floatValue - intValue) * 100); // Assuming you want two decimal places
        
        System.out.println("Integer part: " + intValue);
        System.out.println("Decimal part as int: " + (decimalAsInt+1));
    
    }

   
}
