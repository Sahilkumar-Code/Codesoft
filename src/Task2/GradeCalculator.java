package Task2;
import java.util.Scanner;

public class GradeCalculator {
	static String Name,Grade;
	static float phyMarks,chemMarks,javaMarks,mathsMarks,englishMarks;
	static float sum,percentage;
	static boolean Newcal=true;
	
	public static void sum(float phyMarks,float chemMarks,float javaMarks,float mathsMarks,float englishMarks) {
		float temp=(phyMarks+chemMarks+javaMarks+mathsMarks+englishMarks);
		sum =temp;
		System.out.println("The total marks are "+sum);
	}
	public static void percentage(float sum){
		float temp=((sum)/500)*100;
		percentage=temp;
		System.out.println("The percentage of the student is "+percentage);
	}
	
	public static void Grade(float percentage){
		if(percentage>=30) {
			Grade="F";
		}
		if(percentage>=40) {
			Grade="D";
		}
		if(percentage>=60) {
			Grade="C";
		}
		if(percentage>=80) {
			Grade="B";
		}
		if(percentage>=90) {
			Grade="A"; 
		}
		
		System.out.println("The Grade is "+ Grade);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter Name of student ");
		Name = sc.next();
		
		System.out.println("Enter phy Marks");
		phyMarks = sc.nextFloat();
		
		System.out.println("Enter chem Marks");
		chemMarks = sc.nextFloat();
		
		System.out.println("Enter java Marks");
		javaMarks = sc.nextFloat();
		
		System.out.println("Enter maths Marks");
		mathsMarks = sc.nextFloat();
		
		System.out.println("Enter english Marks");
		englishMarks = sc.nextFloat();
		
		sum(phyMarks,chemMarks,javaMarks,mathsMarks,englishMarks);
		percentage(sum);
		Grade(percentage);
		
		System.out.println("want to calculate new? Choice 1 or 2.");
		System.out.println("1. yes");
		System.out.println("2. no");
		int choice = sc.nextInt();
		if(choice==1)
		{
			Newcal=true;
		}
		else if(choice==2) {
			Newcal=false;
			System.out.println("loging out");
			break;
		}
		}while(Newcal==true);
		
		sc.close();


	}

}
