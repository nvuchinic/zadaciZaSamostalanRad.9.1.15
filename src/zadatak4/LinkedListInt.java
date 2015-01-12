package zadatak4;

public class LinkedListInt {
private Node head;
private int size;

/**
* creates one lined list
*/
public LinkedListInt() {
head = null;
size = 0;
}

/**
* adds new node to the list
* @param value int value of the node
*/
public void add(int value) {
Node newNode = new Node(value);
if (head == null) {
head = newNode;
size++;
return;
}
Node current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
size++;
}

/**
 * method that returns value of particular node(whose position is n(parameter) places away from end of list)
 * @param n number of nodes between end of list and node whose value we want to return
 * @return value of prticular node(node that is n places away from end of list)
 */
public int getNtoLastValue(int n){
	int nodeValue=0, llSize=0, brojac=1,index;
	Node current=head;
	while(current!=null){
		llSize++;
		current=current.next;
	}
	index=llSize-n;
	current=head;
	while(brojac!=index){
		current=current.next;
		brojac++;
	}
	nodeValue=current.value;
	return nodeValue;
}

/**
 * method that returns value of node in the middle of the linked list
 * @return value of node in the middle of the linked list
 */
public int getMiddleValue(){
	int nodeValue=0, llSize=0, brojac=0,middle;
	Node current=head;
	while(current!=null){
		llSize++;
		current=current.next;
	}
	middle=llSize/2;
	current=head;
	while(brojac!=middle){
		current=current.next;
		brojac++;
	}
	nodeValue=current.value;
	return nodeValue;
}
/**
* removes a precise node from the list
* @param index int place where the node is set
*/
public void removeAt(int index) {
if (index < 0 || index >= size)
throw new IndexOutOfBoundsException("nema tog indexa");
if (index == 0) {
head = head.next;
size--;
return;
}
Node current = head.next;
Node previous = head;
int counter = 1;
while (counter < index) {
current = current.next;
previous = previous.next;
counter++;
}
previous.next = current.next;
current.next = null;
}

/*public void removeDoubles(){
	Node currentNode=head;
	Node nextNode=head.next;
	while(current){
		
	}
}*/
/**
* adds a node on the precise place in the list
* @param value int value of the node
* @param index int place in the list
*/
public void add(int value, int index) {
if(index < 0 || index > size)
throw new IndexOutOfBoundsException("nema tog indexa");
Node newNode = new Node(value);
if (index == 0) {
newNode.next = head;
head = newNode;
size++;
return;
}
if(index == size) {
add(value);
return;
}
Node current = head;
int counter = 1;
while (counter < index) {
current = current.next;
counter++;
}
newNode.next = current.next;
current.next = newNode;
size++;
}

/**
* makes an array from the linked list
* @return array of integers
*/
public int[] toArray() {
Node current = head;
int[] array = new int[size];
for(int i = 0; i < array.length; i++) {
array[i] = current.value;
current = current.next;
}
return array;
}

/**
* adds a new linked list onto the to an already existing list
* @param other LinkedListInt new linked list
*/
public void add(LinkedListInt other) {
this.size += other.size;
Node current = head;
if(head == null) {
head = other.head;
return;
}
while(current.next != null)
current = current.next;
current.next = other.head;
}

/**
* prints the list
*/
public void printList() {
Node current = head;
while (current != null) {
System.out.println(current.value);
current = current.next;
}
}
private class Node {
public int value;
public Node next;

/**
* creates a node
* @param value int value of the node
*/
public Node(int value) {
this.value = value;
next = null;
}

/**
* creates a node
* @param value int value of the node
* @param next Node next node in a row
*/
public Node(int value, Node next) {
this.value = value;
this.next = next;
}
}
}
