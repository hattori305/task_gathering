package agent;

import core.Sfmt;
import environment.Field1;

public class ActionB {
	Field1 field;
	Sfmt rnd;
	
	public ActionB(Field1 f, int p[]){
		field = f;
		rnd = new Sfmt(11);
	}
	
	public int act(int pos[], int e_pos[]){

		return (int)(rnd.NextUnif()*9);
	}


}
