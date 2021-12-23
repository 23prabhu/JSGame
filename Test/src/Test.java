import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test {
	
	
	public static void main(String[] args) {
		Linky ll=new Linky();
		ll.insert(5);
		ll.insert(10);
		ll.insert(45);
		ll.insert(23);
		ll.insert(34);
		ll.display();
}

	
}	
class Node{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}
class Linky
{
	Node head;
	
	void insert(int data)
	{
		Node toAdd=new Node(data);
		Node temp=head;
		
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	boolean isEmpty()
	{
		return head==null;
	}
}