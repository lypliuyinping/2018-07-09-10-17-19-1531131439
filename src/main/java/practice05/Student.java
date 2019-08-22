package practice05;



public class Student extends Person{
	private	String klass;
	public Student(String name, String age,String klass) {
		super(name, age);
		this.klass=klass;
		// TODO Auto-generated constructor stub
	}
	public void introduce(String name,String age,String klass) {
		System.out.println("My name is " + name +". I am "+age+
				" years old. I am a Student. I am at Class"+  klass);
	}
	public static void main(String[] args) {
		Person person = new Person("Tom","21");
		person.introduce("Tom","21");
		Student student = new Student("Tom","21","1");
		student.introduce("Tom","21","2");	
	}



}
