
public class Exo3_6 {
	public static int [] tab;
	public static void main(String[] args) {
		tab= new int[10001];
		int plusgranddiviseur=0;
		int nombredediviseur=0;
		for(int i=1; i<=10000;i++){
			for(int j=1; j<=i; j++){
				if (i%j==0){
					nombredediviseur++;
				}
			}
			tab[i]=nombredediviseur;
			if (nombredediviseur>plusgranddiviseur){
				plusgranddiviseur=nombredediviseur;
			}
			nombredediviseur=0;
		}
		System.out.println("Among integers between 1 and 10000,");
		System.out.println("The maximum number of divisors was "+plusgranddiviseur);
		System.out.println("Numbers with that many divisors include:");
		for (int i=0;i<tab.length;i++){
			if(tab[i]==plusgranddiviseur){
				System.out.println(i);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
