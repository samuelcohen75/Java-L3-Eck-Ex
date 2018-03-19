import java.util.Scanner;

public class Exo3_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisir une phrase svp");
		String phrase=sc.nextLine();
		char [] phrase2=phrase.toCharArray();
		String mot="";
		for (int i=0; i<phrase.length();i++){
			if (Character.isLetter(phrase2[i])==true || phrase2[i]=='\''){
				if(phrase2[i]=='\''){
					if(i!=0 && i!=phrase.length()-1){
						if(Character.isLetter(phrase2[i-1])==true && Character.isLetter(phrase2[i+1])==true){
							mot=mot+phrase2[i];
						}
					}
				}
				else{
					mot=mot+phrase2[i];
				}
			}
			else{
				if (mot.isEmpty()==false){
					System.out.println(mot);
					mot="";
				}
			}
		}
		System.out.println(mot);
		sc.close();
		// TODO Auto-generated method stub

	}

}
