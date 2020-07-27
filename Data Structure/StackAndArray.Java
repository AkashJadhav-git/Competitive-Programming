import java.util.Scanner;
import java.util.Stack;

public class StackAndArray {
	public static void main(String[] args) {
		
		for(int j = 0; j<4; j++) {
			Scanner sc = new Scanner(System.in);	
				String input = sc.next();
				Stack<Character> stack = new Stack<Character>();
				char array[] = input.toCharArray();
				
				for(char i: array) {
					if(i=='{')
						stack.push(i);
					else if(i=='}')
						stack.pop();
				}
				if(stack.isEmpty())
					System.out.println(0);
				else
					System.out.println(stack.size()/2);
		}
	}
}
/*
	LIFO :  last in first out.
	
 Output :
 			{}
			0
			{}{}{}
			0
			{{{}
			1
*/
/*
 		Create the stack :	Stack<Character> stack = new Stack<Character>();
 		Display element  :	stack.peek();
 		Add element	 :	stack.push(i);
 		remove element 	 :	stack.pop();
 		Find Size	 :      stack.size();
 		To find empty	 :      stack.isEmpty();
 
 */
