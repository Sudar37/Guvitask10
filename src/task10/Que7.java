package task10;

class Tea1 { // Create Tea1 class
	
public boolean milks;
public boolean sugars;

public Tea1() {
        this.milks = false;
        this.sugars = false;
}

public void prepareTea() {
        System.out.println("Preparing tea with hot water and tea leaves.");
}

public void addMilk() {
        this.milks = true;
        System.out.println("Adding milk to the tea.");
}

public void addSugar() {
        this.sugars = true;
        System.out.println("Adding sugar to the tea.");
}
}

class BlackTea extends Tea {
public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves. Brew for 3-5 minutes.");
}
}

class GreenTea extends Tea {
public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves. Brew for 1-3 minutes.");
}
}

class HerbalTea extends Tea {
public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal tea leaves. Brew for 5-7 minutes.");
}
}

public class Que7 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Tea[] teas = new Tea[4]; // array of class Tea
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        for (Tea tea : teas) {
        tea.prepareTea();
       }
    }
}
--------------------------------------------------------------------------------------------------------------------
OUTPUT:
	
Preparing tea with hot water and tea leaves.
Preparing black tea with hot water and black tea leaves. Brew for 3-5 minutes.
Preparing green tea with hot water and green tea leaves. Brew for 1-3 minutes.
Preparing herbal tea with hot water and herbal tea leaves. Brew for 5-7 minutes.
