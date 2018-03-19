package exochap5.EE53MyClass;

public class PairofDice {
	private int die1;
	private int die2;
	
	public PairofDice() {
		roll();
	}
	public void roll() {
		die1=(int)(Math.random()*6)+1;
		die2=(int)(Math.random()*6)+1;
	}
	public int getDie1() {
		return die1;
	}
	public int getDie2() {
		return die2;
	}
	
	public int getTotal() {
        return die1 + die2;
    }
	public String toString() {
		return die1+";"+die2;
	}
	public static void main(String[] args) {
		PairofDice p=new PairofDice();
		System.out.println(p);
		int count=0;
		while (p.getDie1()+p.getDie2()!=2) {
			count++;
			p.roll();
		}
		System.out.println(p);
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
