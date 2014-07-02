package singleton.threadsafe;

public class Singleton {

	private static volatile Singleton _INSTANCE = null;
	private static Object lock = new Object();

	protected Singleton() {

	}

	public static Singleton getInstance() {
		if (_INSTANCE == null) {
			synchronized (lock) {
				if (_INSTANCE == null) {
					_INSTANCE = new Singleton();
				}
			}
		}
		return _INSTANCE;
	}

}
