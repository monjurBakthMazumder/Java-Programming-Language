# 💻 Java Programming – Day 09: Methods (Functions) in Java

Welcome to **Day 09 of Java Programming**! 🎉
Today we will learn about **methods**, also called **functions**, which are reusable blocks of code that help you **organize your program, avoid repetition, and perform tasks efficiently**.

---

## 🧩 What You’ll Learn Today

1. Method Syntax & Calling
2. Parameters & Arguments
3. Return Types
4. Method Overloading
5. Passing Arrays to Methods
6. Variable Scope

---

## 1️⃣ Method Syntax

- A **method** is a block of code that performs a specific task.
- Can **return a value** or be **void** (no return).

```java id="okmp1d"
static void greet() {
    System.out.println("Hello! Welcome to Java Methods.");
}

public static void main(String[] args) {
    greet(); // calling the method
}
```

**Syntax:**

```java
returnType methodName(parameters){
    // statements
    return value; // if returnType is not void
}
```

---

## 2️⃣ Method Calling

- Methods can be **called from `main()` or other methods**.
- Execution jumps to the method and returns after completion.

```java id="fwsicn"
sayHello();
sayGoodbye();

static void sayHello() { System.out.println("Hello!"); }
static void sayGoodbye() { System.out.println("Goodbye!"); }
```

---

## 3️⃣ Parameters & Arguments

- **Parameters** are variables in method definition.
- **Arguments** are actual values passed to methods during calls.

```java id="param1"
static void greetPerson(String name, int age) {
    System.out.println("Hello " + name + ", you are " + age + " years old.");
}

greetPerson("Alice", 20); // Argument "Alice", 20
greetPerson("Bob", 25);
```

---

## 4️⃣ Return Types

- Methods can **return values** using the `return` keyword.
- Useful for calculations or results.

```java id="return1"
static int add(int a, int b) {
    return a + b;
}

int sum = add(10, 20);
System.out.println("Sum: " + sum);
```

---

## 5️⃣ Method Overloading

- **Same method name**, **different parameters** → compile-time polymorphism.

```java id="overload1"
static int add(int a, int b) { return a + b; }
static int add(int a, int b, int c) { return a + b + c; }
static double add(double a, double b) { return a + b; }

System.out.println(add(5, 10));     // 2 integers
System.out.println(add(1,2,3));     // 3 integers
System.out.println(add(2.5, 3.5));  // 2 doubles
```

---

## 6️⃣ Passing Arrays to Methods

- Arrays can be **passed as parameters** to methods.

```java id="array1"
static void printArray(int[] arr) {
    for(int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}

int[] numbers = {10,20,30,40,50};
printArray(numbers);
```

---

## 7️⃣ Variable Scope

- **Local variables:** exist **inside a method/block**, not accessible outside.
- **Global/static variables:** exist for the **entire class**.

```java id="scope1"
static int globalVar = 100; // global

static void demoMethod() {
    int localVar = 50; // local
    System.out.println("localVar = " + localVar);
    System.out.println("globalVar = " + globalVar);
}

demoMethod();
System.out.println("globalVar = " + globalVar);
```

> ⚠️ Cannot access `localVar` outside `demoMethod()`.

---

## ✅ Day 09 Summary

Today you learned:

✅ Method Syntax & Calling  
✅ Parameters & Arguments  
✅ Return Types  
✅ Method Overloading  
✅ Passing Arrays to Methods  
✅ Variable Scope (local & global)

> **Pro Tip:** Methods help you **write clean, reusable, and organized code**. Understanding them is key to building bigger Java programs.

---

# Author

**Md Monjur Bakth Mazumder**  
**Software Engineer | Lead Frontend Developer**

Software Engineer & Lead Frontend Developer at [Qrinux](https://www.qrinux.com/)  
Software Engineer & Lead Frontend Developer at [Boom Box E-Solutions](https://www.boomboxesolutions.com/)

📧 [Email me](mailto:md.monjurmbm2001@gmail.com)  
🌐 [Portfolio](https://mdmonjurbakthmazumder.netlify.app)

Passionate about building clean, maintainable, and scalable applications
