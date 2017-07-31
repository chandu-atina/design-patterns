# Singleton Pattern

## Java Implementation

### Sigleton - Basic Version

**Code : SingletonBasic.java**

The following rules are applied to achieve Singleton Pattern
* Make the constructor private so that no other class will be able to instantiate the object
* Add private static variable of the same class type. Initially the value is null.
* Add public static method which instantiates(if required) and returns the object's instance
* Method does a null check before instantiating the object.

*Note : The current implementation is not thread safe. Let's say two different threads call getInstance() method at same moment of time(or with nanoseconds delay). Thread1 checks if the instance is null which is true, hence Thread1 creates the object. Now before Thread1 instantiates the object, Thread2 checks if the instance is null which again results to true. This scenario ends up creating two different objects violating the Singleton Pattern rule.*
