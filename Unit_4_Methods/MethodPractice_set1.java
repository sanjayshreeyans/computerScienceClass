
// This code is used to find the area of a rectangle, the cost of a purchase after tax, the cost of a purchase after discount, and the area of a trapezoid.
// The names of the functions are rectArea, computeCost, CostAfterDiscount, and trapezoidArea





// Author: Sanjay Javangula
// Date: 4/13/2023, 10:08:55 AM 
public class MethodPractice_set1 {
    
    public static void main(String[] args) {
        
        System.out.println("rectArea(4,8) = " + rectArea(4, 8));
        System.out.println("computeCost(10, 2.5) = " + computeCost(10, 2.5));
        System.out.println("CostAfterDiscount(86.99, 10) = " + CostAfterDiscount(86.99, 10));
        System.out.println("trapezoidArea(4, 6, 10) = " + trapezoidArea(4, 6, 10));



    }
    public static int rectArea(int l , int w) {
       return (l*w); 
    }

    public static double computeCost(int count, double unitPrice) {
        
        double cost = (count*unitPrice);
        double tax = 1.13;

        cost = cost*tax;
        // make it return with 2 decimal places
        cost = Math.round(cost*100.0)/100.0;
        // Explain how that works
        // 1. multiply by 100.0
        // 2. round it
        // 3. divide by 100.0
        // 4. assign it to cost
        
        return cost;

    }

    public static double CostAfterDiscount(double basePrice, double discountRate)

    {
        double discountRate2 = 1 - (discountRate/100);
        System.out.println("discountRate2 = " + discountRate2);
        double discount = (basePrice*discountRate2);
      
        // make it return with 2 decimal places
        double cost = Math.round(discount*100.0)/100.0;
        
        return cost;
    }


    public static double trapezoidArea(double base1, double base2, double height) {
        double area = ((base1+base2)/2)*height;
        return area;
    }
}
