package chapter06;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	private String name;
	private int age;
	private Singleton() {
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
	this.age = age;
		}
	}
