/*
 * Singleton instance with synchronized double check null getInstance() method.
 * 1. Private constructor (Cannot be instantiated outside the class)
 * 2. public synchronized double check null static method to return the instance
 * 3. Checks for null before synchronized block and also inside synchronized block
 * 
 * Note : Thread safe Singleton Implementation with lazy instantiation.
 */
public class SingletonDoubleCheckNull {

	private static SingletonDoubleCheckNull instance;

	private SingletonDoubleCheckNull() {

	}

	public static SingletonDoubleCheckNull getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckNull.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheckNull();
				}
			}
		}
		return instance;
	}
}
