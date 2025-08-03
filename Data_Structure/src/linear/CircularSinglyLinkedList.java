package linear;


class CNode{
	int data;
	CNode next;
	public CNode(int data) {
		this.data=data;
	}
}
class CMethods{
	static CNode head,tail;
	public static void insertAtBeg(int data) {
		CNode node=new CNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			node.next=head;
			head=node;
			tail.next=head;
		}
	}
	public static void insertAtEnd(int data) {
	    CNode node=new CNode(data);
	    if (head==null) {
	        head=node;
	        tail=node;
	        node.next=head;
	        return;
	    } else {
	        tail.next=node;
	        node.next=head;
	        tail=node;
	    }
	}
public static void display() {
	CNode temp=head;
	do {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}while(temp!=head);
	System.out.println();
}
public static void insertAtpos(int data,int pos){
    CNode node=new CNode(data);
    if(pos==0){
        insertAtBeg(data);
    }
    else 
    {
        CNode temp=head;
        for(int i=1;i<pos;i++) 
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
}
public static void deleteAtBeg() {
    CNode temp=head;
	if(head==null && tail==null) {
		System.out.println("List is empty");
	}
	else {
		tail.next=head.next;
		head=head.next;
		temp.next=null;
		
	}
  }
public static void deletionAtpos(int pos) {
    if(pos==0) {
        deleteAtBeg();
    }
    else
    {
        CNode temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    
    }
}
}

public class CircularSinglyLinkedList extends CMethods {
    public static void main(String[] args) {
    	insertAtBeg(0);
    	insertAtBeg(1);
    	insertAtBeg(2);
    	insertAtBeg(3);
    	insertAtEnd(10);
    	insertAtEnd(30);
    	insertAtEnd(50);
    	insertAtpos(300,2);
    	deleteAtBeg();
    	deletionAtpos(2);
    	display();
    }
}

