
public class Jatekos {

	private int tip;	
	
	public void setTip() {
		this.tip = (int)(Math.random() * ((20 - 1) + 1)) + 1;
	}
	
	public int getTip() {
		return this.tip;
	}
	
}
