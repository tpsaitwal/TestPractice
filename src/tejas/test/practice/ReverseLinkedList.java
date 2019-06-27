package tejas.test.practice;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<String> myLinkedLists = new LinkedList<>();
		for(int i=1;i<=10;i++) {
			myLinkedLists.add("Tejas"+ Math.floorMod(129, i));
		}
		
		if(myLinkedLists == null || myLinkedLists.isEmpty()) {
			System.out.println("Linked List is empty");
			return;
		}
		
		myLinkedLists.forEach(System.out::println);
		int i = myLinkedLists.size()-1;
		LinkedList<String> reveresLinkedLIst = new LinkedList<>();
		while(i >=0) {
			reveresLinkedLIst.add(myLinkedLists.get(i));
			i--;
		}
		
		
		reveresLinkedLIst.forEach(System.err::println);
	}
}

class MyLinkedList {
	private String info;
	private MyLinkedList next;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public MyLinkedList getNext() {
		return next;
	}
	public void setNext(MyLinkedList next) {
		this.next = next;
	}
}
