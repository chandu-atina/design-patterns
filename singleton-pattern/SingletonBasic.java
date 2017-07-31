/*
 * Singleton pattern basic version.
 * 1. Private constructor (Cannot be instantiated outside the class)
 * 2. public static method to return the instance
 * 3. Checks for null before creating an instance
 * 
 * Note : Not thread safe
 */
public class SingletonBasic {

	private static SingletonBasic instance;

	private SingletonBasic() {

	}

	public static SingletonBasic getInstance() {
		if (instance == null) {
			instance = new SingletonBasic();
		}
		return instance;
	}
}
