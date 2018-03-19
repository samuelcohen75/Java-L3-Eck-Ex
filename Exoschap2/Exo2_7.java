import java.util.Scanner;

public class Exo2_7 {
	public static void main(String[] args) {
		double moyenne=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir un nom puis 3 notes svp: ");
		String name=sc.nextLine();
		double note1=sc.nextDouble();
		double note2=sc.nextDouble();
		double note3=sc.nextDouble();
		moyenne=note1+note2+note3;
		moyenne=moyenne/3;
		System.out.println(name+ " La moyenne de l'étudiant est de "+ moyenne);
		sc.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
