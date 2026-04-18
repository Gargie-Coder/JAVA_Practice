# Generics in Java

- Generics provide compile-time type safety by allowing classes, interfaces, and methods to operate on types specified by parameters.
- Generic type parameters are declared in angle brackets `<>`.

**Advantages of Generics:**
- Type safety: prevents ClassCastException at runtime.
- No need for explicit type casting when retrieving values.
- Compile-time type checking.

-----------------------------------------------
**Generic class:**
- A generic class can refer to one or more types using type parameters.
- Common type parameter names: `T` for type, `E` for element, `K` for key, `V` for value.
Ex:
```java
class MyGen<T>{
  T obj;
  void add(T obj){
    this.obj=obj;
  }
  T get(){
    return obj;
  }
}
```
```java
class TestGenerics{
  public static void main(String[] args){
    MyGen<Integer> m=new MyGen<Integer>();
    m.add(2);
    // m.add("ABc");//compile time error
  }
}
// Here T refers to any type(String,Integer,Employee ets);
```
-----------------------------------------------
**Generic methods:**
- A generic method can accept arguments of any specified reference type.
- Declare type parameter before return type, e.g., `<T> void method(T arg)`.

-----------------------------------------------
**Wildcards (useful for generic type flexibility):**

- Upper bounded wildcard: `? extends SomeType` (read-only, allows subclass types).
- Lower bounded wildcard: `? super SomeType` (writeable, allows supertype assignment).
- Unbounded wildcard: `?` (any type).

