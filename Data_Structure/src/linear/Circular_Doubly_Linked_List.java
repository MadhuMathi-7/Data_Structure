package linear;
class CirDubNode{
    int data;
    CirDubNode next,prev;
    public CirDubNode(int data) {
        this.data=data;
        next=null;
        prev=null;
    }
}
class CirDubMethods{
    static CirDubNode head,tail;
    static int count=0;
    public static void insertAtBeg(int data) {
        CirDubNode newnode=new CirDubNode(data);
            if(head==null && tail==null) {
                head=newnode;
                tail=newnode;
                head.next=newnode;
                head.prev=newnode;
            }else {
                newnode.next=head;
                newnode.prev=tail;
                tail.next=newnode;
                head.prev=newnode;
                head=newnode;
            }count++;
    }public static void display() {
        CirDubNode temp=head;
        do {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
        System.out.print("The length of the list: "+count);
    }
}
    

public class Circular_Doubly_Linked_List extends CirDubMethods  {

    public static void main(String[] args) {
        insertAtBeg(7);
        insertAtBeg(8);
        display();
    
    }

}

