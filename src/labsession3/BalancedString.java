package labsession3;
import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	 static boolean isbalancedString(String str) {
		Stack<Character> stack=new Stack<Character>(); 
		for(int i=0;i<str.length();i++) {
			char s=str.charAt(i);
			if(s=='['||s=='('||s=='{') {
				stack.push(s);
			}else if(s==']'){
				if(stack.isEmpty()||stack.pop()!='[') {
					return false;
				}	
			}else if(s=='(') {
				if(stack.isEmpty()||stack.pop()!=')') {
					return false;
				}
			}else if(s==')') {
				if(stack.isEmpty()||stack.pop()!='(') {
					return false;
				}
			}else if(s=='{') {
				if(stack.isEmpty()||stack.pop()!='}') {
					return false;
				}
			}else if(s=='}') {
				if(stack.isEmpty()||stack.pop()!='{') {
					return false;
				}
			}
			
		}
		return stack.isEmpty();
	}
	 // Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		if(isbalancedString(str))
		System.out.println("The entered String has Balanced Brackets");
		else 
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
