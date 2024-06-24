import java.util.*;
import java.io.*;


public class RemoveDuplicate {
	public static String removeDuplicate(String s) {
		 Stack<Character> st = new Stack<>();
	        
	        st.push(s.charAt(0));
	        
	        for(int i = 1; i<s.length(); i++){
	            if(!st.isEmpty() && st.peek() == s.charAt(i)){
	                st.pop(); continue;
	            }
	            st.push(s.charAt(i));
	        }
	        StringBuilder sb = new StringBuilder();
	        while(!st.isEmpty()){
	            sb.append(st.pop());
	        }
	        return String.valueOf(sb.reverse());
		
		
		
	}

	public static void main(String[] args) {
		// YOUR CODES
		// ask the user to enter a string
		// print the string after all two successive duplicate characters
		// removed.
		
		System.out.println("Please enter a string:");
		Scanner console = new Scanner(System.in);
		String userinput=console.next();
		console.close();
		
		System.out.println(removeDuplicate(userinput));
		
		
	}
}
