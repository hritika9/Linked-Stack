package toto;
import java.util.LinkedList;

public class MainPalindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("Hello"));
		System.out.println(checkPalindrome("mama"));
		System.out.println(checkPalindrome("i did, Did I!?"));



	}
	public static boolean checkPalindrome(String str) {
		LinkedList <Character>  stack = new LinkedList <Character>();
		StringBuilder nopuntuationstr = new StringBuilder ();
		String lowercase = str.toLowerCase();
		for(int i=0;i<lowercase.length();i++) {
			char c = lowercase.charAt(i);
			if(c>='a' && c<='z') {
				
				nopuntuationstr.append(c);
				stack.push(c);
				
			}
			
		}
		StringBuilder reversestr = new StringBuilder(stack.size());
		while(!stack.isEmpty()) {
		reversestr.append(stack.pop());
		}
		
		return reversestr.toString().equals(nopuntuationstr.toString());
		
	}

}
