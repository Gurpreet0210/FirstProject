package Module2Asssignments;

public class DisplayArrayAsColumns {

	public static void main(String[] args) {
		String id[] = {"001", "002", "003", "004", "005"};
		String name[] = {"John", "Clark", "Nancy", "Joe", "Mary"};
		int salary[] = {600000, 550000, 500000, 500000, 300000};
		
		display(id, name, salary);
		display(id, name);
	}
	
	public static void display(String id[], String name[], int salary[]) {
		for(int i=0; i < 5; i++) {
			System.out.println("| "+ id[i] +" | "+ name[i] + " | "+salary[i] +" | ");
		}
		System.out.println(" ===========================================");
	}
	
	public static void display(String id[], String name[]) {
		for(int i=0; i < 5; i++) {
			System.out.println("| "+ id[i] +" | "+ name[i] + " | ");
		}
	}
}
