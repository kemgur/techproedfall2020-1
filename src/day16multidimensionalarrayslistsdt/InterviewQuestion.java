package day16multidimensionalarrayslistsdt;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {
		// Count all unique characters in a String
	        
	        Scanner scan = new Scanner (System.in);
	        System.out.println("Enter a string");
	        String s = scan.nextLine();
	        
	        String ch[] = s.split("");
	        System.out.println(Arrays.toString(ch));
	        
	        Arrays.sort(ch);
	        System.out.println(Arrays.toString(ch));
	        
	        int counter = 0;
	        
	        for(int i = 1; i<ch.length; i++) {
	            if(ch[i-1].equals(ch[i])) {
	                counter++;
	                if(i == ch.length-1) {
	                    if(ch[i-1].equals(ch[i])) {
	                    	System.out.println("The number of " + ch[i-1] + ": " + (counter + 1));
	                    }
	                }
	            } else {
	                System.out.println("The number of " + ch[i-1] + ": " + (counter + 1));
	                if(i==ch.length-1) {
	                    System.out.println("The number of " + ch[i] + ": 1");
	                }
	                counter = 0;
	            }
	        }
	        
	        scan.close();
		}
}
