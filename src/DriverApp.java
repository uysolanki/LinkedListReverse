import java.util.Scanner;

public class DriverApp {
	
	
public static void main(String[] args) {
	Node head=null;
	head=create(head);
	System.out.println("At creation of LL");
	display(head);
	
	head=addFirst(head);
	System.out.println("After add first");
	display(head);
	
	addLast(head);
	System.out.println("After add last");
	display(head);
	
	
	head=reverse(head);
	System.out.println("After Reverse");
	display(head);
}




private static Node create(Node head) {
	Scanner sc=new Scanner(System.in);
	Node nn;
	Node temp=head;
	int size;
	System.out.println("Enter Size of Linked List");
	size=sc.nextInt();
	for(int i=1;i<=size;i++)
	{
			System.out.println("Enter Date for Node "+ i);
			float item=sc.nextFloat();
			nn=new Node(item);
			
			if(head==null)
			{
				head=temp=nn;
			}
			else
			{
				temp.next=nn;
				temp=temp.next;
			}
	}
	return head;
}


private static void display(Node temp) {
	while(temp!=null)
	{
		System.out.print(temp.data + "->");
		temp=temp.next;
	}
	System.out.println("null");
	
}

private static Node reverse(Node head) {
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


private static Node addFirst(Node head) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Date for Node ");
	float item=sc.nextFloat();
	Node nn=new Node(item);
	nn.next=head;
	head=nn;
	return head;
}

private static void addLast(Node head) {
	Node temp=head;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Date for Node ");
	float item=sc.nextFloat();
	Node nn=new Node(item);
	
	while(temp.next!=null)
		temp=temp.next;
	
	temp.next=nn;
	
}


}
