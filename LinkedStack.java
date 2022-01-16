package toto;
 import java.util.LinkedList;
 import java.util.ListIterator;
 

public class LinkedStack {
	
	private LinkedList <Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList <Employee>();
	}
	public void push(Employee employee) {
		stack.push(employee);
	}
	public void pop() {
		stack.pop();
	}
	public Employee peek() {
		return stack.peek();
	}
	public boolean isEmpty() {
		return isEmpty();
	}
	public void printStack() {
		
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	

}
