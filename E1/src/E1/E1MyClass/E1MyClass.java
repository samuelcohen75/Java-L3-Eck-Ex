package E1.E1MyClass;
import java.util.Scanner;
import java.util.*;

public class E1MyClass {
	public static ArrayList<Integer> set1;
	public static ArrayList<Integer> set2;;
	
	public E1MyClass(){
		set1=new ArrayList<Integer>();
		set2=new ArrayList<Integer>();
	}
	
	/**
	 * @param set1
	 * @param set2
	 * @return the union of set1 and set2
	 */
	public static ArrayList<Integer> fusion(ArrayList<Integer> set1, ArrayList<Integer> set2){
		ArrayList<Integer> set3=new ArrayList<Integer>();
		for(int i=0;i<set1.size();i++){
			set3.add(set1.get(i));
		}
		for (int j=0;j<set2.size();j++){
			if(noDoublons(set1,set2.get(j))){
				set3.add(set2.get(j));
			}
		}
		return set3;
	}
	
	/**
	 * @param set is an arraylist of integer
	 * @param i an integer
	 * @return true if there are no doublons in set, false if not
	 */
	public static boolean noDoublons(ArrayList<Integer> set, int i){
		if (set.contains(i)){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String[] args) {
		new E1MyClass();
		System.out.println("Entrez des valeurs");
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		while(value!=0){
			if (noDoublons(set1,value)==true){
				set1.add(value);
			}
			value=sc.nextInt();
		}
		System.out.println("Entrez à nouveau des valeurs");
		value=sc.nextInt();
		while(value!=0){
			if (noDoublons(set2,value)==true){
				set2.add(value);
			}
			value=sc.nextInt();
		}
		ArrayList<Integer> set3=fusion(set1,set2);
		System.out.println("1er "+set1);
		System.out.println("2ème "+ set2);
		System.out.println("3ème "+set3);
		sc.close();
		

		
		// TODO Auto-generated method stub

	}

}
