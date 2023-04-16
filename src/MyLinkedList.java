
public class MyLinkedList {
	
	public static Node head;
public static void main(String[] args) {
	MyLinkedList list=new MyLinkedList();
	list.head=new Node(10);
	list.head.next=new Node(20);
	list.head.next.next=new Node(30);
	list.head.next.next.next=new Node(40);
	System.out.println("Display Before Reverse");
	list.display(head);
	
	head=list.reverse(head);
	
	System.out.println("Display After Reverse");
	list.display(head);
	
}

private void display(Node temp) {
	while(temp!=null)
	{
		System.out.print(temp.data + "->");
		temp=temp.next;
	}
	System.out.println("null");
	
}

private Node reverse(Node head) {
	Node left=null;
	Node current=head;
	Node right=null;
	
	while(current!=null)
	{
	
		right=current.next;
		current.next=left;
		left=current;
		current=right;
	}
	return left;
	
}


}
