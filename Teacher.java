package ass2;
// mariam turk , 1211115, sec:8

public class Teacher {
	


		private String name; // teacher name 
		private int id; // teacher id 
		private double basicSalary; 
		private double extraPaymentRate;
		private Course [] courseTaught;
		public Teacher() {
			
		}
		public Teacher(String n, int id, double BS, double EPR, Course[] courseTaught) {
			this.name = n;
			this.id = id;
			this.basicSalary = BS;
			this.extraPaymentRate = EPR;
			this.courseTaught = courseTaught;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}
		public double getExtraPaymentRate() {
			return extraPaymentRate;
		}
		public void setExtraPaymentRate(double extraPaymentRate) {
			this.extraPaymentRate = extraPaymentRate;
		}
		public Course[] getCourseTaught() {
			return courseTaught;
		}
		public void setCourseTaught(Course[] courseTaught) {
			this.courseTaught = courseTaught;
		}
	public void printInfo() {
		for (int i=0;i<courseTaught.length;i++) {
			System.out.println(courseTaught[i]);
		}
		System.out.println("NAME of teacher"+ name+ "ID"+id+"the basic salary"+basicSalary+ "the extra payment rate"+extraPaymentRate);
	}
	public int countCourseLevel(int num) { // take first bit of course id 
		int counte=0;
		int m = 0;
		for (int i=0;i<courseTaught.length;i++) {
			
			int n =courseTaught[i] .getId();
			while(n!=0) {
				
				m = n % 10;
				n=n/10; 
				
			}
		
			if (m==num) {
				counte+=1;
			}
			
		}
		return counte;
	}
	public double calculateExtraPayment() { // cla the new salary for teacher 
		double res;
		res=(countCourseLevel(1)*1*extraPaymentRate) + (countCourseLevel(2)*2*extraPaymentRate )+ (countCourseLevel(3)*3*extraPaymentRate+ countCourseLevel(4)*4*extraPaymentRate);
		return res;
	}
	

	}


