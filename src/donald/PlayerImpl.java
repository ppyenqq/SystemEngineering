package donald;

import java.util.ArrayList;

public class Player {
	public String color;
	public ArrayList<Integer> pos;
	public Player(String c) {
		this.color=c;
		this.pos= new ArrayList<Integer>();
		
	}
	public void move(int num, int figure) {
		pos.set(figure, num);
	}
	
}
