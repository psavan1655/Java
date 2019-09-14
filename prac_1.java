class Student{
	int rollno;
	String name;
Student(int r, String n){
	rollno = r;
	name = n;
}
void display(){
	System.out.println(rollno+""+name);
}

}

public class prac_1{
	public static void main(String args[]){
	Student s1 = new Student(1,"Savan");
	Student s2 = new Student(2,"Palak");
	s1.display();
	s2.display();
}
}
