package Sorting;
import java.util.Scanner;
//import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter list : ");
		//double m=input.nextDouble();
		String s=input.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' ')
				count++;
		//System.out.println("count is = "+count);
		String strArray[] = s.split(" ");
		
	{ 
		for(int x=0;x<count-1;x++)
	//System.out.print(" "+Integer.parseInt(strArray[x]));
			
			if( (Integer.parseInt(strArray[x]))>(Integer.parseInt(strArray[x+1])))
				 
			{System.out.println("the list is  not sorted ");
			
return;}
		
	for(int m=0;m<count-1;m++)

	if( (Integer.parseInt(strArray[m]))<=(Integer.parseInt(strArray[m+1])))
		 
	{ System.out.println("the list is already sorted ");
	 break;}
	}
	}}




