package task10;

class Tea { // create Tea class 
	 
public boolean milk;
public boolean sugar;

public Tea() {
        this.milk = false;
        this.sugar = false;
}

public void prepareTea() {
        System.out.println("Preparing tea with hot water and tea leaves.");
}

public void addMilk() {
        this.milk = true;
        System.out.println("Adding milk to the tea.");
}

public void addSugar() {
        this.sugar = true;
        System.out.println("Adding sugar to the tea.");
}
}
public class Que5 {
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Tea tea = new Tea();
		
	tea.prepareTea(); // Prepare the basic tea 
	tea.addMilk(); // Add milk to the basic tea 
	tea.addSugar(); // Add sugar to the basic tea 
    }
}
----------------------------------------------------------------------------------------------------------------
OUTPUT:

Preparing tea with hot water and tea leaves.
Adding milk to the tea.
Adding sugar to the tea.
