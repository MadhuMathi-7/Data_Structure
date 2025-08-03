//package linear;
////node class
//class Node{
//	int data;
//	Node next;
//	public Node(int data) {   
//		this.data=data;
//		next=null;
//}
////method class
//class Methods{
//	static Node head= null;
//	static int count=0;
//	public static void insertAtBeg(int data) {  
//		Node newNode=new Node(data); 
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//		count++;
//		System.out.println(count);
//		System.out.println(newNode.data);
//		System.out.println(newNode.next);
//		System.out.println(head);
//		System.out.println(newNode);
//		
//	}
//}
//
////main class
//public class SinglyLinked extends Methods{
//	  public static void main(String[] args) {
//		  insertAtBeg(1);
//	  }
//	}
//
//}




////insertion at the begining
//package linear;
////node class
//class Node{
//	int data;
//	Node next;
//	public Node(int data) {   
//		this.data=data;
//		next=null;
//}
////method class
//class Methods{
//	static Node head= null;
//	static int count=0;
//	public static void insertAtBeg(int data) {  
//		Node newNode=new Node(data); 
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//		count++;
//	}
//	public static void display() {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//		System.out.println("Length:"+count);
//	}
//}
//
////main class
//public class SinglyLinked extends Methods{
//	  public static void main(String[] args) {
//		  insertAtBeg(0);
//		  insertAtBeg(2);
//		  insertAtBeg(3);
//		  insertAtBeg(4);
//		  insertAtBeg(5);
//		  display();
//	  }
//	}
//
//}



////insertion at the begining and end
//package linear;
////node class
//class Node{
//	int data;
//	Node next;
//	public Node(int data) {   
//		this.data=data;
//		next=null;
//}
////method class
//class Methods{
//	static Node head= null;
//	static int count=0;
//	public static void insertAtBeg(int data) {  
//		Node newNode=new Node(data); 
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//		count++;
//	}
//	public static void insertAtEnd(int data) {  
//		Node newNode=new Node(data); 
//		Node temp=head;
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		temp.next=newNode;
//		count++;
//	}
//	public static void display() {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//		System.out.println("Length:"+count);
//	}
//}
//
////main class
//public class SinglyLinked extends Methods{
//	  public static void main(String[] args) {
//		  insertAtBeg(0);
//		  insertAtBeg(2);
//		  insertAtBeg(3);
//		  insertAtBeg(4);
//		  insertAtBeg(5);
//		  insertAtEnd(45);
//		  display();
//	  }
//	}
//
//}



//
////insertion at begging,end,at a position
//package linear;
////node class
//class Node{
//	int data;
//	Node next;
//	public Node(int data) {   
//		this.data=data;
//		next=null;
//}
////method class
//class Methods{
//	static Node head= null;
//	static int count=0;
//	public static void insertAtBeg(int data) {  
//		Node newNode=new Node(data); 
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//		count++;
//	}
//	public static void insertAtEnd(int data) {  
//		Node newNode=new Node(data); 
//		Node temp=head;
//		if(head==null) {
//			head=newNode;
//			count++;
//			return;
//		}
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		temp.next=newNode;
//		count++;
//	}
//	public static void insertAtPos(int data,int pos) {  
//		Node newNode=new Node(data); 
//		Node temp=head;
//		if(head==null&&pos!=0) {
//			System.out.println("Invalid position");
//			return;
//		}
//		if(pos==0) {
//			insertAtBeg(data);
//			return;
//		}
//		int i=0;
//		while(i!=pos-1) {
//			if(temp.next==null) {
//				System.out.println("Invalid Position");
//				return;
//			}
//			temp=temp.next;
//			i++;
//		}
//		newNode.next=temp.next;
//		temp.next=newNode;
//		count++;
//	}
//	public static void display() {
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//		System.out.println("Length:"+count);
//	}
//}
//
////main class
//public class SinglyLinked extends Methods{
//	  public static void main(String[] args) {
//		  insertAtBeg(0);
//		  insertAtBeg(2);
//		  insertAtBeg(3);
//		  insertAtBeg(4);
//		  insertAtBeg(5);
//		  insertAtEnd(45);
//		  insertAtPos(80,3);
//		  display();
//	  }
//	}
//
//}
//



//insertion at begging,end,at a position
//Deletion at beg,end,at a position
package linear;
//node class
class Node{
	int data;
	Node next;
	public Node(int data) {   
		this.data=data;
		next=null;
}
//method class
class Methods{
	static Node head= null;
	static int count=0;
	public static void insertAtBeg(int data) {  
		Node newNode=new Node(data); 
		if(head==null) {
			head=newNode;
			count++;
			return;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		count++;
	}
	public static void insertAtEnd(int data) {  
		Node newNode=new Node(data); 
		Node temp=head;
		if(head==null) {
			head=newNode;
			count++;
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		count++;
	}
	public static void insertAtPos(int data,int pos) {  
		Node newNode=new Node(data); 
		Node temp=head;
		if(head==null&&pos!=0) {
			System.out.println("Invalid position");
			return;
		}
		if(pos==0) {
			insertAtBeg(data);
			return;
		}
		int i=0;
		while(i!=pos-1) {
			if(temp.next==null) {
				System.out.println("Invalid Position");
				return;
			}
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		count++;
	}
	public static void deleteAtbeg() {
		Node temp=head;
		head=head.next;
		temp.next=null;
		count--;
	}
	public static void deleteAtPos(int pos) {
		Node temp=head;
		if(pos==0)  deleteAtbeg();
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		count--;
	}
	public static void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		count--;
	}
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		System.out.println("Length:"+count);
	}
}

//main class
public class SinglyLinked extends Methods{
	  public static void main(String[] args) {
		  insertAtBeg(0);
		  insertAtBeg(2);
		  insertAtBeg(3);
		  insertAtBeg(4);
		  insertAtBeg(5);
		  insertAtEnd(45);
		  insertAtPos(80,3);
		  deleteAtbeg();
		  deleteAtEnd();
		  deleteAtPos(2);
		  display();
		  
	  }
	}

}








