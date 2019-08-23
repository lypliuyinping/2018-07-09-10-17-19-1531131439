package practice06;


public class Person {
	String name;
	String age;
	public Person(String name,String age) {
		this.name = name;
		this.age = age;
	}
	public void basicIntroduce(String name,String age) {
		System.out.println("My name is"+ name+". I am " +age+" years old.");
	}
	public static void main(String[] args) {
		Person person = new Person("Tom","21");
		person.basicIntroduce("Tom","21");	
	}
	
}
