/*
 * Singleton instance with early instantiation.
 * 1. Private constructor with instantiation
 * 2. public static method to return the instance

 * Note : Thread safe with early instantiation
 */
public class SingletonEarlyInstantiation {
	
	private static SingletonEarlyInstantiation instance = new SingletonEarlyInstantiation();

	private SingletonEarlyInstantiation() {}
	
	public static SingletonEarlyInstantiation getInstance() {
		return instance;
	}
}
