package exochap5.EE53MyClass;
import java.util.Scanner;

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double max;
    private double min;

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if (num>max) {
        	max=num;
        }
        if (num<min || min==0) {
        	min=num;
        }
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;  
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }
    
    public double getMax() {
    	return max;
    }
    
    public double getMin() {
    	return min;
    }
 // end class StatCalc
	public static void main(String[] args) {
		StatCalc  calc;   // Object to be used to process the data.
		calc = new StatCalc();
		double data;
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir des nombres");
		data=sc.nextDouble();
		while(data!=0){
			calc.enter(data);
			data=sc.nextDouble();
		}
		System.out.println(calc.getCount());
		System.out.println(calc.getSum());
		System.out.println(calc.getMean());
		System.out.println(calc.getStandardDeviation());
		System.out.println(calc.getMax());
		System.out.println(calc.getMin());
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
