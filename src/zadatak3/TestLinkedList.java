package zadatak3;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedListInt lli=new LinkedListInt();
	lli.add(3);
	lli.add(8);
	lli.add(5);
	lli.add(33);
	//lli.add(23);
	//lli.add(112);
	//lli.add(11);
//	lli.printList();
System.out.println("srednji node ima vrijednost "+lli.getMiddleValue());
}
}
