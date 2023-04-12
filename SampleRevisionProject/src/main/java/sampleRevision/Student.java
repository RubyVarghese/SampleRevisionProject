package sampleRevision;

public class Student extends Person {
	int id;
	public void print(int id)
	{
		this.id=id;
		System.out.println("id is "+id);
		
	
	}

	public static void main(String[] args) {
		Student ob=new Student();
		ob.studname("Ruby");
		ob.print(12);
		System.out.println("This is demo");

	}

}
