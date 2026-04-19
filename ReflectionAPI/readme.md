# Reflection Mechanism in Java
Package
- import java.lang.reflect.*;
**What is Reflection?**

# Reflection is:

- The ability to examine the runtime behavior of Java applications
- The ability of a program to inspect and modify its own structure and behavior at runtime

**Uses of Reflection API**

The Reflection API is used to:
# Inspect class and method modifiers such as:
-private
-public
-final
-abstract
Inspect:
-Constructors
-Methods
-Parameters
# Access and modify private data
**Reflection can modify objects, not the blueprint (class)**
Invoke methods, including:
-Public methods
-Private methods
............................................................................................

# java.lang.Class
**For every type of object, the JVM creates an immutable instance of java.lang.Class**
and that is why the class is immutable because it is created by JVM and we cannot change it.only we can create new objects of that class but we cannot change the class itself.only the objects of that class can be changed.
This class provides methods to:
- Examine runtime properties of an object
- Access its members (fields, methods, constructors)
- Retrieve type information
- It also provides the ability to:
- Create new classes and objects
- Most importantly, it acts as the entry point for all Reflection APIs
Example
```java
Class<?> c = "hello".getClass();
```