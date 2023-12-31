import java.util.*;
class Stud_Grade
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		int i,n;
		System.out.println("Enter total number of subjects:");
		n=s.nextInt();
		
		float[] marks=new float[n];
		float total=0,average;
		
		System.out.println("Enter Marks of subjects out of 100:");
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Marks of subject"+(i+1));
			marks[i]=s.nextFloat();
			total=total+marks[i];
		
		}
		average=total/n;
		String f_total = String.format("%.2f", total);
        String f_average = String.format("%.2f", average);
		
		
		System.out.println("Total Marks:"+f_total);
		System.out.println("Average Percentage is: "+f_average);
		System.out.print("Grade is: ");
		
		if(average>90 && average<=100)
		{
			System.out.println("A1");
		}
		else if(average>80 && average<=90)
		{
			System.out.println("A2");
		}
		else if(average>65 && average<=75)
		{
			System.out.println("B1");
		}
		else if(average>55 && average<=65)
		{
			System.out.println("B2");
		}
		else if(average>45 && average<=55)
		{
			System.out.println("C1");
		}
		else if(average>35 && average<=45)
		{
			System.out.println("C2");
		}
		else if(average>30 && average<=35)
		{
			System.out.println("D");
		}
		else if(average<=30)
		{
			System.out.println("Fail");
		}
      
		
	}
}