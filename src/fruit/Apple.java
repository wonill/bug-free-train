package fruit;

public class Apple {
	int price;
	int grade;
	
	boolean clean;
	
	public void eat() {
		price -= 1000;
	}
	
	public void wash() {
		clean = true;
	}
}
