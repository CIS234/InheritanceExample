package cis232.example;

public class InheritanceExample {

	public static void main(String[] args) {
		Bagger b = new Bagger();
		b.setName("Bob the Bagger");
		
		Cashier c = new Cashier();
		c.setName("Chris");
		
		ShiftManager sm = new ShiftManager();
		sm.setName("Sheila");
		
		Employee e = new Employee();
		e.setName("Jake");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(sm);
		System.out.println(e);
	}

}
