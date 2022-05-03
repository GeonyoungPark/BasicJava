package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton();
//		Singleton singleton2 = new Singleton();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		instance1.setAge(10);
		instance2.getAge();
		System.out.println(instance2.getAge());
		
		
		System.out.println(instance1);
		System.out.println(instance2);
	}
}
