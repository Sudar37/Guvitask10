package task10;

class MyTea { // Create MyTea class
	 
public void prepareTea() { 
        System.out.println("Prepares a basic Tea with Hot water and Tea leaves"); 
} 
 
public void addMilk() { 
        System.out.println("Add milk to the basic Tea"); 
} 

public void addSugar() { 
        System.out.println("Add Sugar to the basic Tea"); 
} 
     
class BlackTea extends MyTea {  // Override class
        @Override 
        public void prepareTea() { 
        System.out.println("Preparing black tea with hot water, black tea leaves, and brewing for 5 minutes."); 
} 
} 
 
class GreenTea extends MyTea { 
        @Override 
        public void prepareTea() { 
        System.out.println("Preparing green tea with hot water, green tea leaves, and brewing for 3 minutes."); 
} 
} 
 
class HerbalTea extends MyTea { 
        @Override 
        public void prepareTea() { 
        System.out.println("Preparing herbal tea with hot water, herbal tea leaves, and brewing for 7 minutes."); 
} 
} 
} 

public class Que6 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	MyTea BlackTea = new MyTea();
	BlackTea.prepareTea();

	MyTea GreenTea = new MyTea();
	GreenTea.prepareTea();

	MyTea HerbalTea = new MyTea();
	HerbalTea.prepareTea();
}
}
--------------------------------------------------------------------------------------------------------------------
OUTPUT:

Prepares a basic Tea with Hot water and Tea leaves.
Prepares a basic Tea with Hot water and Tea leaves.
Prepares a basic Tea with Hot water and Tea leaves.
