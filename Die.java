public class Die{
	private int sides;
	private int value;

	public Die(){
		sides = 6;
		value = (int)(Math.random()*6)+1;
	}
	public Die(int sides){
		this.sides = sides;
		this.value = (int)(Math.random()*(sides))+1;
	}
	public int getValue(int value){
		return value;
	}

	public int getSides(int sides){
		return sides;
	}
	public void roll(int sides){
		value = (int)(Math.random()*(sides))+1;
	}
	public String toString(){
		return "Number of sides: "+sides+", Value: "+value;
	}



}