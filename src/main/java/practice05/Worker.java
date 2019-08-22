package practice05;

public class Worker extends Person {

	public Worker(String name, String age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void introduce(String name,String age) {
		System.out.println("My name is " + name +". I am "+age+" years old."+
				" I am a Worker. I have a job.");
	}
	public static void main(String[] args) {
		Worker work = new Worker("Tom","21");
		work.introduce("Tom","21");
		
	}
}
