package ass2;
//mariam turk , 1211115, sec:8
import java.util.*;
public class Testclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter number of teacher");
		int not=input.nextInt(); // number of teacher
		Teacher [] A1 = new Teacher[not]; //array
		for (int i =0 ;i<A1.length;i++) {
			System.out.println("enter teachears name,id,basic salary, and extra paymaent rate");
			int ID;
			String name=input.next();
			 ID=input.nextInt();
			double basicsalary=input.nextDouble();
			double epr=input.nextDouble();
			System.out.println("Enter number of course taught");
			int numoc=input.nextInt(); // number of courses
			Course [] A2 =new Course[numoc]; //array1
			for(int m=0;m<A2.length;m++) {
				System.out.println("Enter Course names and ids");
				String nameC=input.next();
				int idC=input.nextInt();
				A2[m]=new Course(nameC,idC);
				
			}
			A1[i]=new Teacher (name,ID,basicsalary,epr,A2);
		}
System.out.println("Enter your choice od tasks(1-5");
System.out.println("1- print teacher info");
System.out.println("Display all teacher names and total Salari");
System.out.println("Change basic salary for a teachers");
System.out.println("Display sum of total salaries for all teachers");
System.out.println("Exit");
int check=input.nextInt();
while(check!=5) {
	if(check==1) {
		System.out.println("Enter the id of teacher to display his information");
		int idtc=input.nextInt();
		for(int i=0;i<A1.length;i++) {
			if (A1[i].getId() == idtc) {
				A1[i].printInfo();
			}
		}
	}
	if(check==2) {
	for(int i =0;i<A1.length;i++) {
		System.out.println("the name of teacher"+A1[i].getName());
		System.out.println("teacher has total salary="+A1[i].getBasicSalary()+A1[i].calculateExtraPayment());
	}
	}
	if(check==3) {
		System.out.println("Enter teacher's ID");
		int idtc2=input.nextInt();
		for(int i=0;i<A1.length;i++) {
			if (A1[i].getId() == idtc2) {
				System.out.println("pleas enter the new basic salary");
				double NBS=input.nextDouble();
				A1[i].setBasicSalary(NBS);
				A1[i].printInfo();	
			}
	}
	}
		if(check == 4) {
			double res =0;
			for(int i=0;i<A1.length;i++) {
				res+=(A1[i].getBasicSalary()+A1[i].calculateExtraPayment());
				
			}
			System.out.println(res);
		}

	System.out.println("Enter your choice od tasks(1-5)");
	System.out.println("1- print teacher info");
	System.out.println("Display all teacher names and total Salari");
	System.out.println("Change basic salary for a teachers");
	System.out.println("Display sum of total salaries for all teachers");
	System.out.println("Exit");
	check=input.nextInt();

	}

}
}
