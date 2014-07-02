package singleton.threadsafe;

public class UserTest {

	public static void main(String[] args) {

		Singleton singleton1 = new Singleton();
		System.out.println(singleton1);
		Singleton singleton2 = new Singleton();
		System.out.println(singleton2);
		Singleton singleton3 = new Singleton();
		System.out.println(singleton3);
		Singleton singleton4 = new Singleton();
		System.out.println(singleton4);
		Singleton singleton5 = new Singleton();
		System.out.println(singleton5);

	}

}
