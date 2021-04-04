
public class Refrigerator {
	
	String Food;
	int number;
	String Shelflife;
	String Storage;
	
	public Refrigerator() {
	}
	
	public Refrigerator(String Food) {
		this.Food = Food;
	}
	
	public Refrigerator(String Food, int number, String Shelflife, String Storage) {
		this.Food = Food;
		this.number = number;
		this.Shelflife = Shelflife;
		this.Storage = Storage;
	}
	
	public void printinfo() {
		System.out.println("Food :" + this.Food+ "\n" + 
						   "number : " + this.number + "\n" +
				           "Shelflife : " + this.Shelflife + "\n" +
			 	           "Storage : " + this.Storage);
	}
	
}
