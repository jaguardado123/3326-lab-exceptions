# Lab Assignment 18

In this lab you will practice working with exceptions.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Exceptions

As a programmer you can always count on the compiler to catch any syntax erros (*misspelling or forgetting a missing* `;`), however you can still run into **runtime errors**.

Runtime errors may occur when your user inputs a `String` when you expected an `Integer` or an array goes out of bounds. When the JVM encounters these errors it throws an **exception**.

**Exceptions** are unwanted and unexpected events that occur during execution. Exceptions are not caused by syntax errors. 

Java uses `try` and `catch` statements to catch these exceptions without crashing your program.

**Example:**

```java
try {
	int[] my_array = {1, 2, 3};
	// Accessing an index that is out of bounds.
	System.out.print( my_array[7] );
}
catch(Exception e) {
	System.out.print("Something went wrong!");
}
```

The above example has no syntax errors, however it will throw and exception when your program tries to <ins>access an out of bounds index</ins>. Using `try` and `catch` we can prevent our program from crashing.

To learn more about exceptions in Java visit: https://www.w3schools.com/java/java_try_catch.asp or https://www.geeksforgeeks.org/exceptions-in-java/

## Your Assignment

### Array Exceptions

For this assignment the class `ArrayException` and been set up for you with the **private** attribute `lab_array[]`.

Create a **public** method `valueAt()` with a single parameter to return the value at the given index.

**Example:**

```java
ArrayException obj = new ArrayException();
System.out.print( obj.valueAt(0) ); // Should return 7.
```

However, since `lab_array[]` is **private** the programmer using the `ArrayException` class does not know the array's range. Create a `try` and `catch` method inside `valueAt()` to prevent the program from crashing.

If an out of bounds index is given, output an error message and `return 0`.

**Test Your Code:**

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!