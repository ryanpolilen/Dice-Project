import java.util.ArrayList;

public class DiceHolder{

private ArrayList<Die> holder;

public DiceHolder(){
	holder = new ArrayList<>();
}

public int addDie(Die die){
	if(holder.size() < 6){
		holder.add(die);
		return 1;
	}
	else
		return -1;

}

public void shake(){
	for(int x = 0; x < holder.size(); x++){
		holder.get(x).roll();

	}
}

public String toString(){
	String a = "";
	for(int x = 0; x < holder.size(); x++)
		a+= holder.get(x).toString();

	return a;
}



}