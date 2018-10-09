/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.lang.Math;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(7, 8);
		ps3.fizzString("flutter");
		ps3.squirrelPlay(95, true);
		ps3.fizzStringAgain(6);
		ps3.makeBricks(3,5,6);
		ps3.loneSum(6, 7, 8);
		ps3.luckySum(7,13,4);	
		ps3.factorialWithFor(6);
		ps3.factorialWithWhile(7);
		ps3.isPrime(99);
	}
		
	public void dateFashion(int you, int date) {
		
		if(you <= 2 || date <= 2)
		{
			System.out.println("NO.");
		}else if (you >= 8 || date >= 8)
		{
			System.out.println("YES.");
		}else
		{
			System.out.println("MAYBE.");
		}
			
	}
	
	public void fizzString(String str) {
		char letter = str.charAt(0);
		int index = str.length() -1;
		char lastLetter = str.charAt(index);
		if(letter == 'f' && lastLetter == 'b')
		{
			System.out.println("FIZZBUZZ.");
		}else if (letter == 'f')
		{
			System.out.println("FIZZ.");
		}else if (lastLetter == 'b')
		{
			System.out.println("BUZZ.");
		}else
		{
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if(isSummer == false && (temp > 90  && temp <= 100) || temp<60 || temp>100) {
			System.out.println("NO.");
		}
		else if(temp >= 90 && isSummer == true || temp >= 60 && temp <= 90)
		{
			System.out.println("YES.");
		}
	}
	
	public void fizzStringAgain(int n) {
		if(n%3 == 0 && n%5==0)
		{
			System.out.println("FIZZBUZZ!");
		}else if (n%3==0)
		{
			System.out.println("FIZZ!");
		}else if (n%5==0)
		{
			System.out.println("BUZZ!");
		}else
		{
			System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		if(small >= goal)
		{
			System.out.println("YES.");
		}else if(big * 5 + small == goal)
		{
			System.out.println("YES.");
		}else if(goal == big * 5)
		{
			System.out.println("YES.");
		}else if(goal - big *5 <= small && goal-big*5 >=0){
			System.out.println("YES.");
		}else if (goal % 5 == 0 && big*5 >= goal) { 
			System.out.println("YES.");
		}else if (goal - big * 5 < 0 && small * (-1) < goal - big * 5 && small >=  goal%5) 
		{
			System.out.println("YES.");
		}else if(small == goal%5 && big*5>goal && goal-big*5 < small)
		{
			System.out.println("YES.");
		}
		else{
			System.out.println("NO.");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if(a == b && b == c)
		{
			System.out.println("0.");
		}else if (a == b && a != c && b != c) {
			int add = c;
			System.out.println(add+".");
		}else if (a != b && a != c && b == c ) {
			int add = a;
			System.out.println(add+".");
		}else if (a !=b && b != c && a ==c) {
			int add = b;
			System.out.println(add+".");
		}
		else {
		int add = a + b + c;	
		System.out.println(add + ".");
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if(a == 13) {
			int sum = 0;
			System.out.println(sum + ".");
		}else if (b == 13)
		{
			int sum = a;
			System.out.println(sum + ".");
		}else if (c == 13) {
			int sum = a + b;
			System.out.println(sum + ".");
		}else {
			int sum = a + b + c;
			System.out.println(sum + ".");
		}
		
	}
	
	public void factorialWithFor(int n) {
		int org = n;
		int fact = n;
		int poly = n;
		System.out.print(n+"! = ");
		for(int i = 1; i < org; i++) {
			fact = fact * (poly-1);
			poly--;
		}
		System.out.println(fact + ".");
	}
	
	public void factorialWithWhile(int n) {
		int org = n;
		int j = 1;
		int fact = n;
		int poly = n;
		System.out.print(n+"! = ");
		while (j < org) {
			fact = fact * (poly-1);
			poly--;
			j++;
		}
		System.out.println(fact + ".");
	}
	
	public void isPrime(int n) {
		double s = Math.sqrt(n);
		String p = "";
		if(n<=1){
			System.out.println("NOT PRIME.");	
		}else if(n==2 || n ==3){
			System.out.println("PRIME.");
		}else{
			for(int i = 2; i<=s; i++) {
				if(n%i == 0) {
					 p = "NOT PRIME.";
					 break;
				}else {
					 p ="PRIME.";
				}
			}
			System.out.println(p);}
	}
}