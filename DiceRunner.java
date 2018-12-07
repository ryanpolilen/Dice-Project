public class DiceRunner{
	public static void main (String[]args){

		//Test 1
		Die die1 = new Die();
		Die die2 = new Die();
		int count = 0;
		while((die1.getValue()!=1)||(die2.getValue()!=1)){
			die1.roll();
			die2.roll();
			System.out.println(die1);
			System.out.println(die2);
			count++;

		}
		System.out.println("Amount of Rolls:"+count);

		//Test2
		DiceHolder holder = new DiceHolder();
			Die a;
		for(int x = 0; x < 6; x++){
			 a = new Die((int)(Math.random()*6)+1);

			holder.addDie(a);
			System.out.println(holder);
		}

		System.out.println("The holder is full:");

		System.out.println();

		System.out.println(holder);

		holder.shake();
		System.out.println("Shaking container:");
		System.out.println();
		System.out.println(holder);



	}
}