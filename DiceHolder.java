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

}