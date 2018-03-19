package exochap5.EE53MyClass;

public class EE53MyClass {
	
	static final int NUMBER_OF_EXPERIMENTS = 10000;
	private static PairofDice dice = new PairofDice();
	
	/**
	 * @param N 
	 * @return the number of roll before the total of dice equal N
	 */
	public static int rollFor( int N ) {
	       int rollCt = 0;  // Number of rolls made.
	       do {
	          dice.roll();
	          rollCt++;
	       } while ( dice.getTotal() != N );
	       return rollCt;
	}
	

	public static void main(String[] args) {
		   
	       System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
	       System.out.println("----------   --------------   ----------------   --------------");

	       for ( int total = 2;  total <= 12;  total++ ) {
	          StatCalc stats;  // An object that will compute the statistics.
	          stats = new StatCalc();
	          for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
	                // Do the experiment of counting the number of rolls
	                // required to roll the desired total, and enter the
	                // number of rolls into stats' dataset.
	             stats.enter( rollFor(total) );
	          }
	          System.out.printf("%6d", total);
	          System.out.printf("%18.3f", stats.getMean());
	          System.out.printf("%19.3f", stats.getStandardDeviation());
	          System.out.printf("%14.3f", stats.getMax());
	          System.out.println();
	       }
	       
	   } // end main

}
