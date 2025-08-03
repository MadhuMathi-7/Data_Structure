package linear;
class SNode{
	int data;
	SNode next;
	public SNode(int data) {
		this.data=data;
	}
}
public class Stack {
    static SNode top;
    static int count=-1;
    public static void push(int data) {
    	SNode node=new SNode(data);
    	if(top==null) {
    		top=node;
    		return;
    	}
    	else {
    		top.next=node;
    		top=node;
    	}
    }
    public static void main(String[] args) {
    	push(5);
    	push(5);
    	push(5);
    }
}
