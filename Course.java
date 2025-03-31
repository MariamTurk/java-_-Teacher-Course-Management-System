package ass2;
//mariam turk , 1211115, sec:8
public class Course {
private String name;
private int id;
 public Course() {
	 
 }
public Course(String name, int id) {
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	if(name.length()==4);
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void printInfo() {
	System.out.println("NAME"+name+ "the ID"+id); //print the information for teacher 
}
}
