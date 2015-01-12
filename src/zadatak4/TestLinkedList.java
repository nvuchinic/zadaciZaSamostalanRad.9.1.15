package zadatak4;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedListInt lli=new LinkedListInt();
	lli.add(3);
	lli.add(8);
	lli.add(5);
	lli.add(33);
	lli.add(23);
	lli.add(112);
	lli.add(11);
	lli.add(45);
	lli.add(17);
	lli.add(56);

	//lli.printList();
System.out.println("node koji je udaljen 3 mjesta od kraja liste ima vrijednost "+lli.getNtoLastValue(3));
}
}
