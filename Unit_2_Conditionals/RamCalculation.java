
public class RamCalculation {

    public static void main(String[] args) {
        
        int first = 50;
        int second  = first *3;
        double third = first / 15.0;
        first = second;

        if (first < second && third < second) {
            System.out.print(first + "&" + second);
    }

        else {
            System.out.print(first + "#" + second);
        }

    if (second > third) {
        if (second >= first ) {
            System.out.print(second + " is big");
        }
        else {
            System.out.print("Now I am confused");
        }
    }
    else if (second > 10) {
        System.out.print("Are you following this ?\n");
    }

    System.out.printf("%5.2f and last.", third);

    }}