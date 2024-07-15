

public class MinMax {
     int smallest = Integer.MAX_VALUE;
     int largest = Integer.MIN_VALUE;

    public String updateMinMax(int number) {
        if (number < smallest) {
            smallest = number;
        }
        if (number > largest) {
            largest = number;
        }


       return "Smallest: " + smallest + ", Largest: " + largest;
    }
    
}
