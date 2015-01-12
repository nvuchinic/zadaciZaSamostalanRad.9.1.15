package zadatak1;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedListInt lli=new LinkedListInt();
	lli.add(3);
	lli.add(8);
	lli.add(5);
	lli.add(3);
	lli.add(3);
	lli.add(11);
	lli.add(11);
	lli.printList();
	lli.removeDoubles();
	System.out.println("\n\nNakon uklanjanja duplikata:\n_____________________");
	lli.printList();


}
}
